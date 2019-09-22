/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.pojo;

import java.util.Date;

/**
 * @author User
 */
public class BuyingThread2 {

    private int id;
    private String threadName;
    private int threadQuantity;
    private String threadColor;
    private double unitPrice;
    private double totalPrice;
    private Date buyingdate;
    private String importCompany;

    public BuyingThread2() {
    }

    public BuyingThread2(int id, String threadName, int threadQuantity, String threadColor, double unitPrice, double totalPrice, Date buyingdate, String importCompany) {
        this.id = id;
        this.threadName = threadName;
        this.threadQuantity = threadQuantity;
        this.threadColor = threadColor;
        this.unitPrice = unitPrice;
        this.totalPrice = totalPrice;
        this.buyingdate = buyingdate;
        this.importCompany = importCompany;
    }

    public BuyingThread2(String threadName, int threadQuantity, String threadColor, double unitPrice, double totalPrice, Date buyingdate, String importCompany) {
        this.threadName = threadName;
        this.threadQuantity = threadQuantity;
        this.threadColor = threadColor;
        this.unitPrice = unitPrice;
        this.totalPrice = totalPrice;
        this.buyingdate = buyingdate;
        this.importCompany = importCompany;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getThreadName() {
        return threadName;
    }

    public void setThreadName(String threadName) {
        this.threadName = threadName;
    }

    public int getThreadQuantity() {
        return threadQuantity;
    }

    public void setThreadQuantity(int threadQuantity) {
        this.threadQuantity = threadQuantity;
    }

    public String getThreadColor() {
        return threadColor;
    }

    public void setThreadColor(String threadColor) {
        this.threadColor = threadColor;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Date getBuyingdate() {
        return buyingdate;
    }

    public void setBuyingdate(Date buyingdate) {
        this.buyingdate = buyingdate;
    }

    public String getImportCompany() {
        return importCompany;
    }

    public void setImportCompany(String importCompany) {
        this.importCompany = importCompany;
    }

}
