package com.pragra.springdataproject.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Item {

    private Integer itemId;
    private String skuId;
    private String itemName;
    private String itemDec;
    private Integer itemPrice;

}

