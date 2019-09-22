/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.dao;

import com.coderbd.pojo.BuyingChemical3;

import java.util.List;

/**
 * @author User
 */
public interface BuyingChemical3Dao {

    void ctreateTable();

    void save(BuyingChemical3 bc);

    void update(BuyingChemical3 bc);

    BuyingChemical3 getBuyingChemicalById(int id);

    // BuyingChemical3 getGetOrder1ByGetOrder1Code(String code);
    BuyingChemical3 getBuyingChemicalByChemaicalName(String Name);

    void dalete(int id);

    List<BuyingChemical3> getList();

}
