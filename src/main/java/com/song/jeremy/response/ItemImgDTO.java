package com.song.jeremy.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

/**
 * @Description 商品图片
 * @Date 2021/1/9 18:36
 * @Created by Jeremy
 */
public class ItemImgDTO {
    @JsonProperty(value = "id")
    @ApiModelProperty(value = "id", name = "主键")
    private String id;

    @JsonProperty(value = "item_id")
    @ApiModelProperty(value = "item_id", name = "商品ID")
    private String itemId;

    @JsonProperty(value = "url")
    @ApiModelProperty(value = "url", name = "商品URL")
    private String url;

    @JsonProperty(value = "sort")
    @ApiModelProperty(value = "sort", name = "排序")
    private Integer sort;

    @JsonProperty(value = "is_main")
    @ApiModelProperty(value = "is_main", name = "是否是主要图片")
    private Integer isMain;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getIsMain() {
        return isMain;
    }

    public void setIsMain(Integer isMain) {
        this.isMain = isMain;
    }
}
