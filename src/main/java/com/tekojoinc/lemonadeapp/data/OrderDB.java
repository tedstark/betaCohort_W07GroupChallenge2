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

    public static void addHist(OrderHistory orderHist){
        allOrders.add(orderHist);
    }


    public static OrderHistory addCustName(String cnam){
        for(OrderHistory order : allOrders){
            if(order.getCustName().equals("*NEWCUSTOMER*")){
                order.setCustName(cnam);
                return order;
            }
        }
        // if nothing is returned - send filler data
        OrderHistory order = new OrderHistory("NotFound", "N/A", "No Customer","0","0","0");
        return order;
    }
}