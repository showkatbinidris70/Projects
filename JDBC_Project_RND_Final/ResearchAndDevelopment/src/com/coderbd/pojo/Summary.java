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
public class Summary {

    private String orderCode;
    private int totalProduct;
    private int knitting;
    private int dyeing;
    private int finishing;
    private int completedProduct;
    private Date orderDate;
    private Date deliveryDate;

    public Summary() {
    }

    public Summary(String orderCode, int totalProduct, int knitting, int dyeing, int finishing, int completedProduct, Date orderDate, Date deliveryDate) {
        this.orderCode = orderCode;
        this.totalProduct = totalProduct;
        this.knitting = knitting;
        this.dyeing = dyeing;
        this.finishing = finishing;
        this.completedProduct = completedProduct;
        this.orderDate = orderDate;
        this.deliveryDate = deliveryDate;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public int getTotalProduct() {
        return totalProduct;
    }

    public void setTotalProduct(int totalProduct) {
        this.totalProduct = totalProduct;
    }

    public int getKnitting() {
        return knitting;
    }

    public void setKnitting(int knitting) {
        this.knitting = knitting;
    }

    public int getDyeing() {
        return dyeing;
    }

    public void setDyeing(int dyeing) {
        this.dyeing = dyeing;
    }

    public int getFinishing() {
        return finishing;
    }

    public void setFinishing(int finishing) {
        this.finishing = finishing;
    }

    public int getCompletedProduct() {
        return completedProduct;
    }

    public void setCompletedProduct(int completedProduct) {
        this.completedProduct = completedProduct;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }


}
