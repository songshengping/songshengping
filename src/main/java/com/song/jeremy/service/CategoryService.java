package com.song.jeremy.service;

import com.song.jeremy.dbmodel.Category;
import com.song.jeremy.mapper.CategoryMapper;
import com.song.jeremy.mapstruct.CategoryMapStruct;
import com.song.jeremy.response.CategoryDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description 商品目录服务
 * @Date 2021/1/7 22:15
 * @Created by Jeremy
 */
@Service
public class CategoryService {

    @Autowired
    private CategoryMapper categoryMapper;

    /**
     * 按照类型查询目录
     * @param type
     * @return
     */
    public List<CategoryDTO> getCategoryByType(Integer type){
        return CategoryMapStruct.INSTANCE.toResCategoryList(categoryMapper.findCategoryByType(type));
    }

    public List<CategoryDTO> getCategoryByFatherId(Integer id) {
        List<CategoryDTO> result = new ArrayList<>();
        List<Category> categoryList = categoryMapper.findCategoryByFatherId(id);
        for (Category category : categoryList) {
            CategoryDTO categoryDTO = CategoryMapStruct.INSTANCE.toResCategory(category);
            categoryDTO.setSubCategoryList(CategoryMapStruct.INSTANCE.toResCategoryList(categoryMapper.findCategoryByFatherId(category.getId())));
            result.add(categoryDTO);
        }
        return result;
    }
}
