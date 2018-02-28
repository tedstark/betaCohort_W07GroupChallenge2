package com.tekojoinc.lemonadeapp.models;

import java.text.NumberFormat;

public class OrderHistory {

    private String ordDate;
    private String ordNum;
    private String custName;
    private String totLemon;
    private String totLime;
    private String totPink;
    private String totQty;
    private String totCost;

    public OrderHistory(String ordDate, String ordNum, String custName,
                        String totLemon, String totLime, String totPink) {

     this.ordDate = ordDate;
     this.ordNum = ordNum;
     this.custName = custName;
     this.totLemon = totLemon;
     this.totLime = totLime;
     this.totPink = totPink;

        int val1 = Integer.parseInt(totLime);
        int val2 = Integer.parseInt(totLemon);
        int val3 = Integer.parseInt(totPink);
        this.totQty = String.valueOf(val1 + val2 + val3);

        double val4 = ((val1 + val2 + val3) * 2);
        NumberFormat numformat = NumberFormat.getCurrencyInstance();
        String currcost = numformat.format(val4);
        this.totCost = currcost;

    }

    public String getOrdDate() {
        return ordDate;
    }

    public void setOrdDate(String ordDate) {
        this.ordDate = ordDate;
    }

    public String getOrdNum() {
        return ordNum;
    }

    public void setOrdNum(String ordNum) {
        this.ordNum = ordNum;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getTotLemon() {
        return totLemon;
    }

    public void setTotLemon(String totLemon) {
        this.totLemon = totLemon;
    }

    public String getTotLime() {
        return totLime;
    }

    public void setTotLime(String totLime) {
        this.totLime = totLime;
    }

    public String getTotPink() {
        return totPink;
    }

    public void setTotPink(String totPink) {
        this.totPink = totPink;
    }

    public String getTotQty() {
        return totQty;
    }

    public void setTotQty(String totQty) {
        this.totQty = totQty;
    }

    public String getTotCost() {
        return totCost;
    }

    public void setTotCost(String totCost) {
        this.totCost = totCost;
    }
}
