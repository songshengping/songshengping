package com.song.jeremy.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @Description 商品目录
 * @Date 2021/1/7 22:23
 * @Created by Jeremy
 */
public class CategoryDTO {

    @JsonProperty(value = "id")
    private Integer id;

    @JsonProperty(value = "name")
    private String name;

    @JsonProperty(value = "type")
    private Integer type;

    @JsonProperty(value = "father_id")
    private Integer fatherId;

    @JsonProperty(value = "logo")
    private String logo;

    @JsonProperty(value = "slogan")
    private String slogan;

    @JsonProperty(value = "cat_image")
    private String catImage;

    @JsonProperty(value = "bg_color")
    private String bgColor;

    @JsonProperty(value = "sub_category_list")
    private List<CategoryDTO> subCategoryList;

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

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getFatherId() {
        return fatherId;
    }

    public void setFatherId(Integer fatherId) {
        this.fatherId = fatherId;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
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

    public List<CategoryDTO> getSubCategoryList() {
        return subCategoryList;
    }

    public void setSubCategoryList(List<CategoryDTO> subCategoryList) {
        this.subCategoryList = subCategoryList;
    }
}
