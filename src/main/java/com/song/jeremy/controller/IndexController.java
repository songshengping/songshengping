package com.song.jeremy.controller;

import com.song.jeremy.response.CarouselDTO;
import com.song.jeremy.response.CategoryDTO;
import com.song.jeremy.response.CategoryItemDTO;
import com.song.jeremy.service.CarouselService;
import com.song.jeremy.service.CategoryService;
import com.song.jeremy.service.ItemService;
import com.song.jeremy.utils.APIResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    @Autowired
    private CategoryService categoryService;

    @Autowired
    private ItemService itemService;
    @GetMapping(value = "/carousel")
    @ApiOperation(value = "查询轮播图")
    public APIResponse<List<CarouselDTO>> getIndexCarousel(){
        return new APIResponse<List<CarouselDTO>>(carouselService.getAllCarousel());
    }

    @GetMapping(value = "/cats")
    @ApiOperation(value = "商品一级分类")
    public APIResponse<List<CategoryDTO>> getIndexCats(){
        return new APIResponse<List<CategoryDTO>>(categoryService.getCategoryByType(1));
    }
    @GetMapping(value = "/subCat/{id}")
    @ApiOperation(value = "商品二级分类")
    public APIResponse<List<CategoryDTO>> getIndexSubCat(@ApiParam(value = "一级分类ID", name = "id")
                                                         @PathVariable(value = "id", name = "id")Integer id){
        return new APIResponse<List<CategoryDTO>>(categoryService.getCategoryByFatherId(id));
    }

    @GetMapping(value = "/sixNewItems/{catId}")
    @ApiOperation(value = "一级分类展示首页的六个商品")
    public APIResponse<CategoryItemDTO> getIndexSixItems(@ApiParam(value = "一级分类ID", name = "catId")
                                                         @PathVariable(value = "catId", name = "catId")Integer catId){
        return new APIResponse<CategoryItemDTO>(itemService.getIndexSixItems(catId));
    }
}
