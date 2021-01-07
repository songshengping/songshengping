package com.song.jeremy.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

/**
 * @Description 商品
 * @Date 2021/1/7 23:16
 * @Created by Jeremy
 */
public class ItemsDTO {
    @JsonProperty(value = "id")
    private String id;
    @JsonProperty(value = "item_name")
    private String itemName;
    @JsonProperty(value = "cat_id")
    private Integer catId;
    @JsonProperty(value = "root_cat_id")
    private Integer rootCatId;
    @JsonProperty(value = "sell_counts")
    private Integer sellCounts;
    @JsonProperty(value = "on_off_status")
    private Integer onOffStatus;
    @JsonProperty(value = "content")
    private String content;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Integer getCatId() {
        return catId;
    }

    public void setCatId(Integer catId) {
        this.catId = catId;
    }

    public Integer getRootCatId() {
        return rootCatId;
    }

    public void setRootCatId(Integer rootCatId) {
        this.rootCatId = rootCatId;
    }

    public Integer getSellCounts() {
        return sellCounts;
    }

    public void setSellCounts(Integer sellCounts) {
        this.sellCounts = sellCounts;
    }

    public Integer getOnOffStatus() {
        return onOffStatus;
    }

    public void setOnOffStatus(Integer onOffStatus) {
        this.onOffStatus = onOffStatus;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
