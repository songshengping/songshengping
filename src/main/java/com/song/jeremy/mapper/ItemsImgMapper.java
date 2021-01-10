package com.song.jeremy.mapper;

import com.song.jeremy.dbmodel.ItemsImg;

import java.util.List;

public interface ItemsImgMapper {
    int deleteByPrimaryKey(String id);

    int insert(ItemsImg record);

    int insertSelective(ItemsImg record);

    ItemsImg selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ItemsImg record);

    int updateByPrimaryKey(ItemsImg record);

    List<ItemsImg> findItemsImgByModel(ItemsImg record);
}