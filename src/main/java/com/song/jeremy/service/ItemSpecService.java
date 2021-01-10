package com.song.jeremy.service;

import com.song.jeremy.dbmodel.ItemsSpec;
import com.song.jeremy.mapper.ItemsSpecMapper;
import com.song.jeremy.mapstruct.ItemsMapStruct;
import com.song.jeremy.response.ItemSpecDTO;
import com.song.jeremy.utils.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description 商品描述
 * @Date 2021/1/10 10:58
 * @Created by Jeremy
 */
@Service
public class ItemSpecService {
    @Autowired
    private ItemsSpecMapper itemsSpecMapper;

    public ItemSpecDTO getItemSpecByModel(ItemsSpec itemsSpec){
        List<ItemsSpec> itemsSpecList = itemsSpecMapper.findItemsSpecByModel(itemsSpec);
        return null;
    }

    /**
     * 根据ID查询商品描述
     * @param itemId 商品ID
     * @return
     */
    public List<ItemSpecDTO> getItemSpecById(String itemId){
        ItemsSpec itemsSpec = new ItemsSpec();
        itemsSpec.setItemId(itemId);
        List<ItemsSpec> itemsSpecList = itemsSpecMapper.findItemsSpecByModel(itemsSpec);
        return ItemsMapStruct.INSTANCE.toResItemsSpecList(itemsSpecList);
    }
}
