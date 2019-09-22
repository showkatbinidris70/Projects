/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.dao;

import com.coderbd.pojo.BuyingThread2;

import java.util.List;

/**
 * @author User
 */
public interface BuyingThread2Dao {

    void ctreateTable();

    void save(BuyingThread2 bt);

    void update(BuyingThread2 bt);

    // BuyingThread2 getGetOrder1ById(int id);
    BuyingThread2 getBuyingThreadById(int id);

    // BuyingThread2 getGetOrder1ByGetOrder1Code(String code);
    BuyingThread2 getBuyingThreadByThreadName(String name);

    void dalete(int id);

    List<BuyingThread2> getList();

}
