package com.song.jeremy.mapper;

import com.song.jeremy.dbmodel.Items;

import java.util.List;

public interface ItemsMapper {
    int deleteByPrimaryKey(String id);

    int insert(Items record);

    int insertSelective(Items record);

    Items selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Items record);

    int updateByPrimaryKeyWithBLOBs(Items record);

    int updateByPrimaryKey(Items record);

    List<Items> findItemsByCatId(Integer rootCatId);
}