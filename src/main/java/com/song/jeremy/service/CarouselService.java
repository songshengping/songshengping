package com.song.jeremy.service;

import com.song.jeremy.dbmodel.Carousel;
import com.song.jeremy.mapper.CarouselMapper;
import com.song.jeremy.mapstruct.CarouselMapStruct;
import com.song.jeremy.response.CarouselDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description 轮播图相关服务类
 * @User JeremySong
 * @Date 2021/1/7 13:04
 * @Version 1.0
 */
@Service
public class CarouselService {
    @Autowired
    private CarouselMapper carouselMapper;

    public List<CarouselDTO> getAllCarousel(){
       List<Carousel> carouselList = carouselMapper.findAll();
       return CarouselMapStruct.INSTANCE.toResCarouseList(carouselList);
    }
}
