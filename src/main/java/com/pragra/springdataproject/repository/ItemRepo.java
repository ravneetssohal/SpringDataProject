package com.pragra.springdataproject.repository;

import com.pragra.springdataproject.common.SqlQueries;
import com.pragra.springdataproject.entity.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ItemRepo {

    @Autowired
    JdbcTemplate jdbcTemplate;
    StringBuilder insertQuery = new StringBuilder(SqlQueries.insertItem);

    public List<Item> getAllIetms(){

        List<Item> items = jdbcTemplate.query(SqlQueries.allItems, new BeanPropertyRowMapper<Item>(Item.class));

        return items;
    }

    //Using StringBuilder.
    public void addItem(Item item){
        jdbcTemplate.update(String.valueOf(insertQuery), item.getItemId(), item.getSkuId(), item.getItemName(), item.getItemDec(), item.getItemPrice());
    }
}
