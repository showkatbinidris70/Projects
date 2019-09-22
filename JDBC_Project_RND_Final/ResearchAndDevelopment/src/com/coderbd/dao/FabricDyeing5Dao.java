/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.dao;

import com.coderbd.pojo.FabricDyeing5;

import java.util.List;

/**
 * @author User
 */
public interface FabricDyeing5Dao {
    void ctreateTable();

    void save(FabricDyeing5 fd);

    void update(FabricDyeing5 fd);

    FabricDyeing5 getFabricDyeingById(int id);

    FabricDyeing5 getFabricDyeingByFabricName(String name);

    void dalete(int id);

    List<FabricDyeing5> getList();
}
