/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.dao;

import com.coderbd.pojo.FabricKnitting4;

import java.util.List;

/**
 * @author User
 */
public interface FabricKnitting4Dao {

    void ctreateTable();

    void save(FabricKnitting4 fk);

    void update(FabricKnitting4 fk);

    FabricKnitting4 getFabricKnittingById(int id);

    FabricKnitting4 getFabricKnittingByFabricName(String name);

    void dalete(int id);

    List<FabricKnitting4> getList();
}
