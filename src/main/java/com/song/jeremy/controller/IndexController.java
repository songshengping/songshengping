package com.song.jeremy.controller;

import com.song.jeremy.response.CarouselDTO;
import com.song.jeremy.utils.APIResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description 主页相关Controller
 * @Date 2021/1/7 0:16
 * @Created by Jeremy
 */
@RestController
@RequestMapping(value = "/index")
public class IndexController {

    @GetMapping(value = "/carousel")
    public APIResponse<CarouselDTO> getIndexCarousel(){
        return new APIResponse<CarouselDTO>(new CarouselDTO());
    }
}
