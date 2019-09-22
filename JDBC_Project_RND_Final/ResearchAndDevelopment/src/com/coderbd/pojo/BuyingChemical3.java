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
public class BuyingChemical3 {
    private int id;
    private String chemicalName;
    private int chemicalQuantity;
    private double unitPrice;
    private double totalPrice;
    private Date buyingdate;
    private String importCompany;
    private Date expiredDate;

    public BuyingChemical3() {
    }

    public BuyingChemical3(int id, String chemicalName, int chemicalQuantity, double unitPrice, double totalPrice, Date buyingdate, String importCompany, Date expiredDate) {
        this.id = id;
        this.chemicalName = chemicalName;
        this.chemicalQuantity = chemicalQuantity;
        this.unitPrice = unitPrice;
        this.totalPrice = totalPrice;
        this.buyingdate = buyingdate;
        this.importCompany = importCompany;
        this.expiredDate = expiredDate;
    }

    public BuyingChemical3(String chemicalName, int chemicalQuantity, double unitPrice, double totalPrice, Date buyingdate, String importCompany, Date expiredDate) {
        this.chemicalName = chemicalName;
        this.chemicalQuantity = chemicalQuantity;
        this.unitPrice = unitPrice;
        this.totalPrice = totalPrice;
        this.buyingdate = buyingdate;
        this.importCompany = importCompany;
        this.expiredDate = expiredDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getChemicalName() {
        return chemicalName;
    }

    public void setChemicalName(String chemicalName) {
        this.chemicalName = chemicalName;
    }

    public int getChemicalQuantity() {
        return chemicalQuantity;
    }

    public void setChemicalQuantity(int chemicalQuantity) {
        this.chemicalQuantity = chemicalQuantity;
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

    public Date getExpiredDate() {
        return expiredDate;
    }

    public void setExpiredDate(Date expiredDate) {
        this.expiredDate = expiredDate;
    }


}
