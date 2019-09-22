/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.dao;

import com.coderbd.pojo.FabricFinishing6;

import java.util.List;

/**
 * @author User
 */
public interface FabricFinishing6Dao {
    void ctreateTable();

    void save(FabricFinishing6 ff);

    void update(FabricFinishing6 ff);

    FabricFinishing6 getFabricFinishingById(int id);

    FabricFinishing6 getFabricFinishingByFinishingName(String name);

    void dalete(int id);

    List<FabricFinishing6> getList();
}
