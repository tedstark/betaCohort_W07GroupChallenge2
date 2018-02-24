package com.tekojoinc.lemonadeapp.data;

import com.tekojoinc.lemonadeapp.models.OrderHistory;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class OrderDB {

    private static List<OrderHistory> allOrders = new ArrayList<>();

    public static List<OrderHistory> getAllOrders(){
        return allOrders;
    }

    public static void addEntry(OrderHistory orderEntry){
        allOrders.add(orderEntry);
    }
}