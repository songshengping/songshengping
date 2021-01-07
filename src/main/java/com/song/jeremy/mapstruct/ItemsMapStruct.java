package com.song.jeremy.mapstruct;

import com.song.jeremy.dbmodel.Items;
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
}
