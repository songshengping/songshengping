package com.song.jeremy.service;

import com.song.jeremy.dbmodel.Category;
import com.song.jeremy.dbmodel.Items;
import com.song.jeremy.mapper.CategoryMapper;
import com.song.jeremy.mapper.ItemsMapper;
import com.song.jeremy.mapstruct.CategoryMapStruct;
import com.song.jeremy.mapstruct.ItemsMapStruct;
import com.song.jeremy.response.CategoryItemDTO;
import com.song.jeremy.response.ItemsDTO;
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

    public CategoryItemDTO getIndexSixItems(Integer rootCatId) {
        Category category = categoryMapper.selectByPrimaryKey(rootCatId);
        CategoryItemDTO categoryItemDTO = CategoryMapStruct.INSTANCE.toResCategoryItem(category);
        List<Items> itemsList = itemsMapper.findItemsByCatId(rootCatId);
        List<ItemsDTO> itemsDTOList = ItemsMapStruct.INSTANCE.toResItemsList(itemsList);
        categoryItemDTO.setItemList(itemsDTOList);
        return categoryItemDTO;
    }
}
