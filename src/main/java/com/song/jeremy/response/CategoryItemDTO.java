package com.song.jeremy.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @Description TODO
 * @Date 2021/1/7 23:13
 * @Created by Jeremy
 */
public class CategoryItemDTO {
    @JsonProperty(value = "cat_id")
    private Integer id;

    @JsonProperty(value = "cat_name")
    private String name;

    @JsonProperty(value = "slogan")
    private String slogan;

    @JsonProperty(value = "cat_image")
    private String catImage;

    @JsonProperty(value = "bg_color")
    private String bgColor;

    @JsonProperty(value = "item_list")
    private List<ItemsDTO> itemList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSlogan() {
        return slogan;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    public String getCatImage() {
        return catImage;
    }

    public void setCatImage(String catImage) {
        this.catImage = catImage;
    }

    public String getBgColor() {
        return bgColor;
    }

    public void setBgColor(String bgColor) {
        this.bgColor = bgColor;
    }

    public List<ItemsDTO> getItemList() {
        return itemList;
    }

    public void setItemList(List<ItemsDTO> itemList) {
        this.itemList = itemList;
    }
}
