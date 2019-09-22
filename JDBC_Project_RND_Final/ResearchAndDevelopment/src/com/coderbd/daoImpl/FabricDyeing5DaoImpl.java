/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.daoImpl;

import com.coderbd.conn.ProductBDConnection;
import com.coderbd.dao.FabricDyeing5Dao;
import com.coderbd.pojo.FabricDyeing5;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author User
 */
public class FabricDyeing5DaoImpl implements FabricDyeing5Dao {

    static Connection conn = ProductBDConnection.getConnection();

    public static void main(String[] args) {
        ProductBDConnection.getConnection();
    }

    @Override
    public void ctreateTable() {

        String sql = "create table IF NOT EXISTS fabricDyeing(id int(11) auto_increment primary key, fabric_name varchar(50),fabric_qty int(11), height double, width double,color_name varchar(50), delivery_date date)";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            System.out.println("fabricDyeing Table Created");
        } catch (SQLException ex) {
            Logger.getLogger(BuyingChemical3DaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void save(FabricDyeing5 fd) {

        String sql = "insert into fabricDyeing(fabric_name ,fabric_qty, height ,width,  color_name , delivery_date) values (?,?,?,?,?,?)";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, fd.getFabricName());
            pstm.setInt(2, fd.getFabricQuantity());
            pstm.setDouble(3, fd.getHeight());
            pstm.setDouble(4, fd.getWidth());
            pstm.setString(5, fd.getColorName());
            pstm.setDate(6, new java.sql.Date(fd.getDeliveryDate().getTime()));
            pstm.executeUpdate();
            System.out.println("Update successfully into fabricDyeing table");
        } catch (SQLException ex) {
            Logger.getLogger(BuyingThread2DaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(FabricDyeing5 fd) {
        String sql = "update fabricDyeing set fabric_name = ? where = id ?";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, fd.getFabricName());
            pstm.setInt(2, fd.getFabricQuantity());
            pstm.setDouble(3, fd.getHeight());
            pstm.setDouble(4, fd.getWidth());
            pstm.setString(5, fd.getColorName());
            pstm.setDate(6, new java.sql.Date(fd.getDeliveryDate().getTime()));
            pstm.executeUpdate();
            System.out.println("Inset successfully into fabricDyeing table");
        } catch (SQLException ex) {
            Logger.getLogger(BuyingThread2DaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public FabricDyeing5 getFabricDyeingById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public FabricDyeing5 getFabricDyeingByFabricName(String name) {

        FabricDyeing5 fabricDyeing5 = null;
        String sql = "Select * from fabricDyeing where fabric_name = ?";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, name);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                FabricDyeing5 fabricDyeing = new FabricDyeing5(rs.getString(1), rs.getInt(2), rs.getDouble(3), rs.getDouble(4), rs.getString(5), rs.getDate(6));

            }
        } catch (SQLException ex) {
            Logger.getLogger(BuyingThread2DaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return fabricDyeing5;
    }

    @Override
    public void dalete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<FabricDyeing5> getList() {

        List<FabricDyeing5> list = new ArrayList();
        String sql = "select * from fabricDyeing";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                FabricDyeing5 fabricDyeing5 = new FabricDyeing5(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getDouble(4), rs.getDouble(5), rs.getString(6), rs.getDate(7));
                list.add(fabricDyeing5);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BuyingThread2DaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

}
