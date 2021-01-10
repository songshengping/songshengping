package com.song.jeremy.controller;

import com.song.jeremy.response.ItemDetailDTO;
import com.song.jeremy.service.ItemService;
import com.song.jeremy.utils.APIResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Description 商品前端控制类
 * @Date 2021/1/9 18:34
 * @Created by Jeremy
 */
@RestController
@RequestMapping(value = "items")
public class ItemController {

    @Autowired
    private ItemService itemService;

    @GetMapping(value = "/info/{itemId}")
    public APIResponse<ItemDetailDTO> getItemDetailByItemId(@ApiParam(value = "商品ID",name = "itemId")
                                                            @PathVariable(value = "itemId")String itemId){
        return new APIResponse<>(itemService.getItemDetailByItemId(itemId));
    }
}
