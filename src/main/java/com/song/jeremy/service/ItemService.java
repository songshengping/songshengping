package com.song.jeremy.service;

import com.github.pagehelper.PageHelper;
import com.song.jeremy.dbmodel.*;
import com.song.jeremy.mapper.*;
import com.song.jeremy.mapstruct.CategoryMapStruct;
import com.song.jeremy.mapstruct.ItemsMapStruct;
import com.song.jeremy.response.CategoryItemDTO;
import com.song.jeremy.response.ItemDetailDTO;
import com.song.jeremy.response.ItemsDTO;
import com.song.jeremy.utils.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description 商品服务
 * @Date 2021/1/7 23:11
 * @Created by Jeremy
 */
@Service
public class ItemService {

    @Autowired
    private ItemsMapper itemsMapper;

    @Autowired
    private CategoryMapper categoryMapper;

    @Autowired
    private ItemsImgMapper itemsImgMapper;

    @Autowired
    private ItemsParamMapper itemsParamMapper;

    @Autowired
    private ItemsSpecMapper itemsSpecMapper;

    public CategoryItemDTO getIndexSixItems(Integer rootCatId) {
        Category category = categoryMapper.selectByPrimaryKey(rootCatId);
        CategoryItemDTO categoryItemDTO = CategoryMapStruct.INSTANCE.toResCategoryItem(category);
        PageHelper.startPage(1,6);
        List<Items> itemsList = itemsMapper.findItemsByCatId(rootCatId);
        List<ItemsDTO> itemsDTOList = ItemsMapStruct.INSTANCE.toResItemsList(itemsList);
        categoryItemDTO.setItemList(itemsDTOList);
        return categoryItemDTO;
    }

    /**
     * 查询商品详细信息
     * 1.查询商品信息
     * 2.查询商品图片信息
     * 3.查询商品参数信息
     * 4.查询商品描述信息
     * @param itemId
     * @return
     */
    public ItemDetailDTO getItemDetailByItemId(String itemId) {
        ItemDetailDTO result = new ItemDetailDTO();
        // 查询商品信息
        Items items = itemsMapper.selectByPrimaryKey(itemId);
        result.setItem(ItemsMapStruct.INSTANCE.toResItems(items));
        // 查询商品图片信息
        ItemsImg itemsImgModel = new ItemsImg();
        itemsImgModel.setItemId(itemId);
        List<ItemsImg> itemsImgList = itemsImgMapper.findItemsImgByModel(itemsImgModel);
        result.setItemImgList(ItemsMapStruct.INSTANCE.toResItemsImgList(itemsImgList));
        // 查询商品参数信息
        ItemsParam itemsParamModel = new ItemsParam();
        itemsParamModel.setItemId(itemId);
        List<ItemsParam> itemsParamList = itemsParamMapper.findItemsParamByModel(itemsParamModel);
        if (!StringUtil.isNullOrBlank(itemsParamList)) {
            result.setItemParams(ItemsMapStruct.INSTANCE.toResItemsParam(itemsParamList.iterator().next()));
        }
        // 查询商品描述信息
        ItemsSpec itemsSpecModel = new ItemsSpec();
        itemsSpecModel.setItemId(itemId);
        List<ItemsSpec> itemsSpecList = itemsSpecMapper.findItemsSpecByModel(itemsSpecModel);
        result.setItemSpecList(ItemsMapStruct.INSTANCE.toResItemsSpecList(itemsSpecList));
        return result;
    }
}
