package com.pragra.springdataproject.common;

public interface SqlQueries {
    String allItems = "SELECT * FROM ITEM";
    String insertItem = "INSERT INTO ITEM VALUES (?,?,?,?,?)";
}
