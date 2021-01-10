package com.song.jeremy.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;

/**
 * @Description 商品描述
 * @Date 2021/1/9 18:37
 * @Created by Jeremy
 */
public class ItemSpecDTO {
    @JsonProperty(value = "id")
    @ApiModelProperty(value = "id", name = "吃法")
    private String id;

    @JsonProperty(value = "item_id")
    @ApiModelProperty(value = "item_id", name = "吃法")
    private String itemId;

    @JsonProperty(value = "name")
    @ApiModelProperty(value = "name", name = "吃法")
    private String name;

    @JsonProperty(value = "stock")
    @ApiModelProperty(value = "stock", name = "吃法")
    private Integer stock;

    @JsonProperty(value = "discounts")
    @ApiModelProperty(value = "discounts", name = "吃法")
    private BigDecimal discounts;

    @JsonProperty(value = "price_discount")
    @ApiModelProperty(value = "price_discount", name = "吃法")
    private Integer priceDiscount;

    @JsonProperty(value = "price_normal")
    @ApiModelProperty(value = "price_normal", name = "吃法")
    private Integer priceNormal;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public BigDecimal getDiscounts() {
        return discounts;
    }

    public void setDiscounts(BigDecimal discounts) {
        this.discounts = discounts;
    }

    public Integer getPriceDiscount() {
        return priceDiscount;
    }

    public void setPriceDiscount(Integer priceDiscount) {
        this.priceDiscount = priceDiscount;
    }

    public Integer getPriceNormal() {
        return priceNormal;
    }

    public void setPriceNormal(Integer priceNormal) {
        this.priceNormal = priceNormal;
    }
}
