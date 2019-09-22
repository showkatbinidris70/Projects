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
public class FabricDyeing5 {

    private int id;
    private String fabricName;
    private int fabricQuantity;
    private double height;
    private double width;
    private String colorName;
    private Date deliveryDate;

    public FabricDyeing5() {
    }

    public FabricDyeing5(int id, String fabricName, int fabricQuantity, double height, double width, String colorName, Date deliveryDate) {
        this.id = id;
        this.fabricName = fabricName;
        this.fabricQuantity = fabricQuantity;
        this.height = height;
        this.width = width;
        this.colorName = colorName;
        this.deliveryDate = deliveryDate;
    }

    public FabricDyeing5(String fabricName, int fabricQuantity, double height, double width, String colorName, Date deliveryDate) {
        this.fabricName = fabricName;
        this.fabricQuantity = fabricQuantity;
        this.height = height;
        this.width = width;
        this.colorName = colorName;
        this.deliveryDate = deliveryDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFabricName() {
        return fabricName;
    }

    public void setFabricName(String fabricName) {
        this.fabricName = fabricName;
    }

    public int getFabricQuantity() {
        return fabricQuantity;
    }

    public void setFabricQuantity(int fabricQuantity) {
        this.fabricQuantity = fabricQuantity;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public String getColorName() {
        return colorName;
    }

    public void setColorName(String colorName) {
        this.colorName = colorName;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }


}
