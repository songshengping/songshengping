package com.song.jeremy.utils;

import lombok.Getter;

/**
 * @Description TODO
 * @Date 2021/1/7 0:36
 * @Created by Jeremy
 */
@Getter
public enum APIErrorCode {
    SUCCESS(0, "成功");
    private String errorMessage;
    private Integer code;
    APIErrorCode(Integer code, String errorMessage){
        this.code = code;
        this.errorMessage = errorMessage;
    }
}
