package com.song.jeremy.response;

import java.util.List;

/**
 * @Description 商品详情
 * @Date 2021/1/9 18:35
 * @Created by Jeremy
 */
public class ItemDetailDTO {
    private ItemsDTO item;
    private List<ItemImgDTO> itemImgList;
    private ItemParamDTO itemParams;
    private List<ItemSpecDTO> itemSpecList;

    public ItemsDTO getItem() {
        return item;
    }

    public void setItem(ItemsDTO item) {
        this.item = item;
    }

    public List<ItemImgDTO> getItemImgList() {
        return itemImgList;
    }

    public void setItemImgList(List<ItemImgDTO> itemImgList) {
        this.itemImgList = itemImgList;
    }

    public ItemParamDTO getItemParams() {
        return itemParams;
    }

    public void setItemParams(ItemParamDTO itemParams) {
        this.itemParams = itemParams;
    }

    public List<ItemSpecDTO> getItemSpecList() {
        return itemSpecList;
    }

    public void setItemSpecList(List<ItemSpecDTO> itemSpecList) {
        this.itemSpecList = itemSpecList;
    }
}
