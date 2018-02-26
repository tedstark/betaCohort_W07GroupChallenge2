package com.tekojoinc.lemonadeapp.data;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
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

    public static OrderHistory getOrder(String cnam){
        for(OrderHistory order : allOrders){
            if(order.getCustName().equalsIgnoreCase(cnam)){
                return order;
            }
        }
        // if nothing is returned - send filler data
        OrderHistory order = new OrderHistory("NotFound", "N/A", "getOrder:No Customer","0","0","0");
        return order;
    }

    public static OrderHistory addCustName(String cnam){
        for(OrderHistory order : allOrders){
            if(order.getCustName().equals("CUSTOMER_NAME")){
                order.setCustName(cnam);
                System.out.println("inside addCustName");
                System.out.println("cnam=" + cnam);
                return order;
            }
        }
        // if nothing is returned - send filler data
        OrderHistory order = new OrderHistory("NotFound", "N/A", "addCustName:No Customer","0","0","0");
        return order;
    }
}