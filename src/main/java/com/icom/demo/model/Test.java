package com.icom.demo.model;

public class Test {

    private int id;
    private String name;
    private String currentPosition;
    private String date;
    private String productionType;
    private String policyType;
    private long policyNumber;
    private String riderCode;
    private String plan;
    private double amount;



    public Test () {

    }
    public Test(
            int id,
            String name,
            String currentPosition,
            String date,
            String productionType,
            String policyType,
            long policyNumber,
            String riderCode,
            String plan,
            double amount) {
                    super();
                    this.id = id;
                    this.name = name;
                    this.currentPosition = currentPosition;
                    this.date = date;
                    this.productionType = productionType;
                    this.policyType = policyType;
                    this.policyNumber = policyNumber;
                    this.riderCode = riderCode;
                    this.plan = plan;
                    this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCurrentPosition() {
        return currentPosition;
    }

    public void setCurrentPosition(String currentPosition) {
        this.currentPosition = currentPosition;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getProductionType() {
        return productionType;
    }

    public void setProductionType(String productionType) {
        this.productionType = productionType;
    }

    public String getPolicyType() {
        return policyType;
    }

    public void setPolicyType(String policyType) {
        this.policyType = policyType;
    }

    public long getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(long policyNumber) {
        this.policyNumber = policyNumber;
    }

    public String getRiderCode() {
        return riderCode;
    }

    public void setRiderCode(String riderCode) {
        this.riderCode = riderCode;
    }

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
