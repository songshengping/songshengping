package com.song.jeremy.mapstruct;

import com.song.jeremy.dbmodel.Carousel;
import com.song.jeremy.response.CarouselDTO;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(nullValueCheckStrategy= NullValueCheckStrategy.ALWAYS)
public interface CarouselMapStruct {
    CarouselMapStruct INSTANCE = Mappers.getMapper(CarouselMapStruct.class);

    CarouselDTO toResCarouse(Carousel carousel);

    List<CarouselDTO> toResCarouseList(List<Carousel> carouselList);

}
