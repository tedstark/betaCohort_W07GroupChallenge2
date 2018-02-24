package com.tekojoinc.lemonadeapp.models;

public class OrderHistory {

    private String ordDate;
    private String ordNum;
    private String custName;
    private String totQty;
    private String totCost;

    public OrderHistory(String ordDate, String ordNum, String custName, String totQty, String totCost) {
        this.ordDate = ordDate;
        this.ordNum = ordNum;
        this.custName = custName;
        this.totQty = totQty;
        this.totCost = totCost;
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
