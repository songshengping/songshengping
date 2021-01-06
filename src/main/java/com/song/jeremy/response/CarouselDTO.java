package com.song.jeremy.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @Description TODO
 * @Date 2021/1/7 0:22
 * @Created by Jeremy
 */
@Getter
@Setter
public class CarouselDTO {

    @JsonProperty(value = "name")
    private String name;

    private String test;
}
