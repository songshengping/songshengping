package com.song.jeremy.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @Description 轮播图实体类
 * @Date 2021/1/7 0:22
 * @Created by Jeremy
 */
@ApiModel(value = "轮播图")
public class CarouselDTO {

    @JsonProperty(value = "id")
    @ApiModelProperty(value = "唯一标识")
    private Integer id;

    @JsonProperty(value = "image_url")
    @ApiModelProperty(value = "轮播图背景")
    private String imageUrl;

    @JsonProperty(value = "background_color")
    @ApiModelProperty(value = "轮播图背景颜色")
    private String backgroundColor;

    @JsonProperty(value = "item_id")
    @ApiModelProperty(value = "商品标识")
    private String itemId;

    @JsonProperty(value = "cat_id")
    @ApiModelProperty(value = "cat标识")
    private String catId;

    @JsonProperty(value = "type")
    @ApiModelProperty(value = "轮播图类型")
    private Integer type;

    @JsonProperty(value = "sort")
    @ApiModelProperty(value = "轮播图排序")
    private Integer sort;

    @JsonProperty(value = "is_show")
    @ApiModelProperty(value = "是否显示")
    private Integer isShow;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getCatId() {
        return catId;
    }

    public void setCatId(String catId) {
        this.catId = catId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getIsShow() {
        return isShow;
    }

    public void setIsShow(Integer isShow) {
        this.isShow = isShow;
    }
}
