package com.song.jeremy.mapstruct;

import com.song.jeremy.dbmodel.Carousel;
import com.song.jeremy.dbmodel.Category;
import com.song.jeremy.response.CarouselDTO;
import com.song.jeremy.response.CategoryDTO;
import com.song.jeremy.response.CategoryItemDTO;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(nullValueCheckStrategy= NullValueCheckStrategy.ALWAYS)
public interface CategoryMapStruct {
    CategoryMapStruct INSTANCE = Mappers.getMapper(CategoryMapStruct.class);

    CategoryDTO toResCategory(Category category);

    List<CategoryDTO> toResCategoryList(List<Category> carouselList);

    CategoryItemDTO toResCategoryItem(Category category);
}
