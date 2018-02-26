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
    public String indexRoute() {
        return "index";
    }

    @RequestMapping("/shopping")
    public String shoppingRoute() {
        return "shopping";
    }

    @RequestMapping("/cust")
    public String custRoute() {
        return "customer";
    }

    @RequestMapping("/confirm")
    public String confirmRoute() {
        return "confirm";
    }

    @RequestMapping("/summary")
    public String summaryRoute() {
        return "summary";
    }

    // display orders on history page
    @RequestMapping("/history")
    public String getOrders(ModelMap modelMap) {
    modelMap.put("orderlist",OrderDB.getAllOrders());
    return"history";
}
//    public String getOrders(ModelMap modelMap){
//        List<OrderHistory> orderlist = OrderDB.getAllOrders();
//        modelMap.put("order", orderlist);
//        System.out.println("inside /history orderlist:");
//        System.out.println(orderlist);
//        return "history";
//    }

    // add order to the order history array
    @RequestMapping("/order/{odte}/{onum}/{cnam}/{leqty}/{liqty}/{piqty}")
    public String addToHist(
            @PathVariable String odte,
            @PathVariable String onum,
            @PathVariable String cnam,
            @PathVariable String leqty,
            @PathVariable String liqty,
            @PathVariable String piqty,
            ModelMap modelMap
    ){
        OrderHistory newHist = new OrderHistory(odte,onum,cnam,leqty,liqty,piqty);
        OrderDB.addHist(newHist);
        modelMap.put("order", newHist);
        return "customer";
    }
    // update customer name to last order
    @RequestMapping("/custname/{cnam}")
    public String addNameToOrder(
            @PathVariable String cnam,
            ModelMap modelMap
    ){
        System.out.println("inside addNameToOrder cnam" + cnam);
        OrderHistory fndOrder = OrderDB.addCustName(cnam);
        System.out.println("order" + fndOrder);
        modelMap.put("order", fndOrder);
        return "summary";
    }

    // get order by customer name for summary page
    @RequestMapping("/ordersummary/{cnam}")
    public String getOrderSummary(
            @PathVariable String cnam,
            ModelMap modelMap
    ){
        System.out.println("inside /ordersummary");
        System.out.println("cnam" + cnam);
        OrderHistory fndOrder = OrderDB.getOrder(cnam);
        modelMap.put("order", fndOrder);
        return "summary";
    }

    // get order by customer name for confirmation page
    @RequestMapping("/orderconfirm/{cnam}")
    public String getOrderConfirm(
            @PathVariable String cnam,
            ModelMap modelMap
    ){
        System.out.println("inside /ordersconfirm");
        System.out.println("cnam" + cnam);
        OrderHistory fndOrder = OrderDB.getOrder(cnam);
        modelMap.put("order", fndOrder);
        return "confirm";
    }

}
