/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.pojo;

import java.util.Date;


public class FabricFinishing6 {
    private int id;
    private String FabricName;
    private String finishingName;
    private int FabricQuantity;
    private double height;
    private double width;
    private String colorName;
    private Date deliveryDate;

    public FabricFinishing6() {
    }

    public FabricFinishing6(int id, String FabricName, String finishingName, int FabricQuantity, double height, double width, String colorName, Date deliveryDate) {
        this.id = id;
        this.FabricName = FabricName;
        this.finishingName = finishingName;
        this.FabricQuantity = FabricQuantity;
        this.height = height;
        this.width = width;
        this.colorName = colorName;
        this.deliveryDate = deliveryDate;
    }

    public FabricFinishing6(String FabricName, String finishingName, int FabricQuantity, double height, double width, String colorName, Date deliveryDate) {
        this.FabricName = FabricName;
        this.finishingName = finishingName;
        this.FabricQuantity = FabricQuantity;
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
        return FabricName;
    }

    public void setFabricName(String FabricName) {
        this.FabricName = FabricName;
    }

    public String getFinishingName() {
        return finishingName;
    }

    public void setFinishingName(String finishingName) {
        this.finishingName = finishingName;
    }

    public int getFabricQuantity() {
        return FabricQuantity;
    }

    public void setFabricQuantity(int FabricQuantity) {
        this.FabricQuantity = FabricQuantity;
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

    public void save(FabricFinishing6 fabricFinishing6) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
