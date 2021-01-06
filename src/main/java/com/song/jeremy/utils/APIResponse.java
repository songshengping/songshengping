package com.song.jeremy.utils;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @Description 统一响应类
 * @Date 2021/1/7 0:20
 * @Created by Jeremy
 */
@Getter
@Setter
@NoArgsConstructor
public class APIResponse<T> {
    private Boolean success;
    private Integer code;
    private String errorMessage;
    private T data;
    public APIResponse(APIErrorCode errorCode){
        this.code = errorCode.getCode();
        this.errorMessage = errorCode.getErrorMessage();
        this.success = errorCode == APIErrorCode.SUCCESS;
    }
    public APIResponse(T data){
        this(APIErrorCode.SUCCESS);
        this.data = data;
    }
}
