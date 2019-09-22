
package com.coderbd.pojo;

import java.util.Date;


public class GetOrder1 {
    private int id;
    private String orderCode;
    private int productQuantity;
    private double unitPrice;
    private double totalPrice;
    private Date orderDate;
    private Date deliveryDate;

    public GetOrder1() {
    }

    public GetOrder1(int id, String orderCode, int productQuantity, double unitPrice, double totalPrice, Date currentDate, Date deliveryDate) {
        this.id = id;
        this.orderCode = orderCode;
        this.productQuantity = productQuantity;
        this.unitPrice = unitPrice;
        this.totalPrice = totalPrice;
        this.orderDate = currentDate;
        this.deliveryDate = deliveryDate;
    }

    public GetOrder1(String orderCode, int productQuantity, double unitPrice, double totalPrice, Date currentDate, Date deliveryDate) {
        this.orderCode = orderCode;
        this.productQuantity = productQuantity;
        this.unitPrice = unitPrice;
        this.totalPrice = totalPrice;
        this.orderDate = currentDate;
        this.deliveryDate = deliveryDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
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

    public Date getorderDate() {
        return orderDate;
    }

    public void setorderDate(Date currentDate) {
        this.orderDate = currentDate;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }


}
