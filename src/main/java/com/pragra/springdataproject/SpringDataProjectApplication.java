package com.pragra.springdataproject;

import com.pragra.springdataproject.entity.Item;
import com.pragra.springdataproject.repository.ItemRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringDataProjectApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringDataProjectApplication.class, args);
        ItemRepo itemRepo = context.getBean(ItemRepo.class);

        //Using builder to insert.
        //Items Added using JdbcTemplate. Commented because these are already added in the database and will throw exception because of primary key being present.
        /*Item item1 = Item.builder()
                .itemId(2)
                .skuId("sku_2")
                .itemName("Laptop")
                .itemDec("MacBook 13 imch M1")
                .itemPrice(999).build();
        itemRepo.addItem(item1);*/

        /*Item item2 = Item.builder()
                .itemId(3)
                .skuId("sku_3")
                .itemName("Monitor")
                .itemDec("LG OLED 23 inch 120 fps")
                .itemPrice(499).build();
        itemRepo.addItem(item2);*/

        /*Item item3 = Item.builder()
                .itemId(4)
                .skuId("sku_4")
                .itemName("Oven")
                .itemDec("LG Oven")
                .itemPrice(199).build();
        itemRepo.addItem(item3);

        Item item4 = Item.builder()
                .itemId(5)
                .skuId("sku_5")
                .itemName("Microwave")
                .itemDec("LG Microwave")
                .itemPrice(89).build();
        itemRepo.addItem(item4);*/

        //Inserting use All args Constructor.
        /*Item item = new Item(6, "sku_6","Mobile", "iPhone 15 Pro 128GB", 1599);
        itemRepo.addItem(item);*/

        //Getting list of all the items.
        List<Item> allIetms = itemRepo.getAllIetms();

        //Printing the list in the console.
        allIetms.forEach(System.out::println);


    }

}
