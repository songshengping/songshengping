package com.song.jeremy.mapper;

import com.song.jeremy.dbmodel.ItemsSpec;

import java.util.List;

public interface ItemsSpecMapper {
    int deleteByPrimaryKey(String id);

    int insert(ItemsSpec record);

    int insertSelective(ItemsSpec record);

    ItemsSpec selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ItemsSpec record);

    int updateByPrimaryKey(ItemsSpec record);

    List<ItemsSpec> findItemsSpecByModel(ItemsSpec itemsSpec);

}