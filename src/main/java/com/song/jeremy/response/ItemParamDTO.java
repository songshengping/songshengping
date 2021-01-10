package com.song.jeremy.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

/**
 * @Description 商品参数
 * @Date 2021/1/9 18:37
 * @Created by Jeremy
 */
public class ItemParamDTO {

    @JsonProperty(value = "id")
    @ApiModelProperty(value = "id", name = "主键")
    private String id;

    @JsonProperty(value = "item_id")
    @ApiModelProperty(value = "item_id", name = "商品ID")
    private String itemId;

    @JsonProperty(value = "produc_place")
    @ApiModelProperty(value = "produc_place", name = "商品价格")
    private String producPlace;

    @JsonProperty(value = "foot_period")
    @ApiModelProperty(value = "foot_period", name = "footPeriod")
    private String footPeriod;

    @JsonProperty(value = "brand")
    @ApiModelProperty(value = "brand", name = "brand")
    private String brand;

    @JsonProperty(value = "factory_name")
    @ApiModelProperty(value = "factory_name", name = "工厂名称")
    private String factoryName;

    @JsonProperty(value = "factory_address")
    @ApiModelProperty(value = "factory_address", name = "工厂地址")
    private String factoryAddress;

    @JsonProperty(value = "packaging_method")
    @ApiModelProperty(value = "packaging_method", name = "打包方法")
    private String packagingMethod;

    @JsonProperty(value = "weight")
    @ApiModelProperty(value = "weight", name = "重量")
    private String weight;

    @JsonProperty(value = "storage_method")
    @ApiModelProperty(value = "storage_method", name = "储存方法")
    private String storageMethod;

    @JsonProperty(value = "eat_method")
    @ApiModelProperty(value = "eat_method", name = "吃法")
    private String eatMethod;

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

    public String getProducPlace() {
        return producPlace;
    }

    public void setProducPlace(String producPlace) {
        this.producPlace = producPlace;
    }

    public String getFootPeriod() {
        return footPeriod;
    }

    public void setFootPeriod(String footPeriod) {
        this.footPeriod = footPeriod;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getFactoryName() {
        return factoryName;
    }

    public void setFactoryName(String factoryName) {
        this.factoryName = factoryName;
    }

    public String getFactoryAddress() {
        return factoryAddress;
    }

    public void setFactoryAddress(String factoryAddress) {
        this.factoryAddress = factoryAddress;
    }

    public String getPackagingMethod() {
        return packagingMethod;
    }

    public void setPackagingMethod(String packagingMethod) {
        this.packagingMethod = packagingMethod;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getStorageMethod() {
        return storageMethod;
    }

    public void setStorageMethod(String storageMethod) {
        this.storageMethod = storageMethod;
    }

    public String getEatMethod() {
        return eatMethod;
    }

    public void setEatMethod(String eatMethod) {
        this.eatMethod = eatMethod;
    }
}
