package com.tekojoinc.lemonadeapp.controller;

import com.tekojoinc.lemonadeapp.data.OrderDB;
import com.tekojoinc.lemonadeapp.models.OrderHistory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class AppController {
    @RequestMapping("/")
    public String indexRoute(){
        return "index";
    }
    @RequestMapping("/shopping")
    public String shoppingRoute(){
        return "shopping";
    }
    @RequestMapping("/cust")
    public String custRoute(){
        return "customer";
    }
    @RequestMapping("/confirm")
    public String confirmRoute(){
        return "confirm";
    }
    @RequestMapping("/history")
    public String getOrders(ModelMap modelMap){
        // CHECK THAT ORDER HISTORY NOT EMPTY
        List<OrderHistory> orderlist = OrderDB.getAllOrders();
//        if (orderlist.isEmpty()) {
//            return "history";
//        } else {
        modelMap.put("orderlist", orderlist);
        return "history";
    }
    @RequestMapping("/order/{odte}/{onum}/{cnam}/{tqty}/{tcst}")
    public String addToHist(
            @PathVariable String odte,
            @PathVariable String onum,
            @PathVariable String cnam,
            @PathVariable String tqty,
            @PathVariable String tcst,
            ModelMap modelMap
    ){
        OrderHistory newEntry = new OrderHistory(odte,onum,cnam,tqty,tcst);
        OrderDB.addEntry(newEntry);
        modelMap.put("entry", newEntry);
        return "confirm";
    }
}
