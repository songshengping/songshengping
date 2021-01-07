package com.song.jeremy.controller;

import com.song.jeremy.response.CarouselDTO;
import com.song.jeremy.service.CarouselService;
import com.song.jeremy.utils.APIResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description 主页相关Controller
 * @Date 2021/1/7 0:16
 * @Created by Jeremy
 */
@RestController
@RequestMapping(value = "/index")
@Api(value = "/index", tags = "首页相关控制类")
public class IndexController {

    @Autowired
    private CarouselService carouselService;

    @GetMapping(value = "/carousel")
    @ApiOperation(value = "查询轮播图")
    public APIResponse<List<CarouselDTO>> getIndexCarousel(){
        return new APIResponse<List<CarouselDTO>>(carouselService.getAllCarousel());
    }

    @GetMapping(value = "/cats")
    @ApiOperation(value = "查询轮播图")
    public APIResponse<List<CarouselDTO>> getIndexCats(){
        return new APIResponse<List<CarouselDTO>>(carouselService.getAllCarousel());
    }
}
