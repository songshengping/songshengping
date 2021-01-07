package com.song.jeremy.mapper;

import com.song.jeremy.dbmodel.Category;

import java.util.List;

public interface CategoryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Category record);

    int insertSelective(Category record);

    Category selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Category record);

    int updateByPrimaryKey(Category record);

    List<Category> findCategoryByType(Integer type);

    List<Category> findCategoryByFatherId(Integer id);
}