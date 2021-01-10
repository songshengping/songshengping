package com.song.jeremy.mapper;

import com.song.jeremy.dbmodel.ItemsParam;

import java.util.List;

public interface ItemsParamMapper {
    int deleteByPrimaryKey(String id);

    int insert(ItemsParam record);

    int insertSelective(ItemsParam record);

    ItemsParam selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ItemsParam record);

    int updateByPrimaryKey(ItemsParam record);

    List<ItemsParam> findItemsParamByModel(ItemsParam record);
}