package com.song.jeremy.mapstruct;

import com.song.jeremy.dbmodel.Items;
import com.song.jeremy.dbmodel.ItemsImg;
import com.song.jeremy.dbmodel.ItemsParam;
import com.song.jeremy.dbmodel.ItemsSpec;
import com.song.jeremy.response.ItemImgDTO;
import com.song.jeremy.response.ItemParamDTO;
import com.song.jeremy.response.ItemSpecDTO;
import com.song.jeremy.response.ItemsDTO;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * @Description TODO
 * @Date 2021/1/7 23:28
 * @Created by Jeremy
 */
@Mapper(nullValueCheckStrategy= NullValueCheckStrategy.ALWAYS)
public interface ItemsMapStruct {
    ItemsMapStruct INSTANCE = Mappers.getMapper(ItemsMapStruct.class);

    ItemsDTO toResItems(Items items);

    List<ItemsDTO> toResItemsList(List<Items> itemsList);

    ItemSpecDTO toResItemsSpec(ItemsSpec itemsSpec);

    List<ItemSpecDTO> toResItemsSpecList(List<ItemsSpec> itemsSpecList);

    ItemParamDTO toResItemsParam(ItemsParam itemsParam);

    List<ItemParamDTO> toResItemsParamList(List<ItemParamDTO> itemsSpecList);

    ItemImgDTO toResItemsImg(ItemsImg itemsImg);

    List<ItemImgDTO> toResItemsImgList(List<ItemsImg> itemsSpecList);
}
