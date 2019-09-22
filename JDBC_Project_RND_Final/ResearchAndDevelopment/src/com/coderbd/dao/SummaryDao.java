/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.dao;

import com.coderbd.pojo.Summary;

import java.util.Date;
import java.util.List;

/**
 * @author User
 */
public interface SummaryDao {

    void createTable();

    void save(Summary s);

    void update(Summary s);

    //  Summary getProductByDate(Date date);
    Summary getProductByCode(String code);

    List<Summary> getList();

}
