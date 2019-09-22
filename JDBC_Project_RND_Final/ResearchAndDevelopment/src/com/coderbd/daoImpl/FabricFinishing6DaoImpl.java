/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.daoImpl;

import com.coderbd.conn.ProductBDConnection;
import com.coderbd.dao.FabricFinishing6Dao;
import com.coderbd.pojo.FabricFinishing6;

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
public class FabricFinishing6DaoImpl implements FabricFinishing6Dao {

    static Connection conn = ProductBDConnection.getConnection();

    public static void main(String[] args) {
        ProductBDConnection.getConnection();
    }

    @Override
    public void ctreateTable() {

        String sql = "create table IF NOT EXISTS fabricFinishing(id int(11) auto_increment primary key, fabric_name varchar(50),finishing_name varchar(50),fabric_qty int(11), height double, width double,color_name varchar(50), delivery_date date)";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            System.out.println("fabricFinishing Table Created");
        } catch (SQLException ex) {
            Logger.getLogger(BuyingChemical3DaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void save(FabricFinishing6 ff) {

        String sql = "insert into fabricFinishing(fabric_name, finishing_name, fabric_qty, height ,width,  color_name , delivery_date) values  (?,?,?,?,?,?,?)";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, ff.getFabricName());
            pstm.setString(2, ff.getFinishingName());
            pstm.setInt(3, ff.getFabricQuantity());
            pstm.setDouble(4, ff.getHeight());
            pstm.setDouble(5, ff.getWidth());
            pstm.setString(6, ff.getColorName());
            pstm.setDate(7, new java.sql.Date(ff.getDeliveryDate().getTime()));
            pstm.executeUpdate();
            System.out.println("Inset successfully into fabricFinishing table");
        } catch (SQLException ex) {
            Logger.getLogger(BuyingThread2DaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(FabricFinishing6 ff) {

        String sql = "update fabricFinishing set fabric_name = ? where id = ?";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, ff.getFabricName());
            pstm.setString(2, ff.getFinishingName());
            pstm.setInt(3, ff.getFabricQuantity());
            pstm.setDouble(4, ff.getHeight());
            pstm.setDouble(5, ff.getWidth());
            pstm.setString(6, ff.getColorName());
            pstm.setDate(7, new java.sql.Date(ff.getDeliveryDate().getTime()));
            pstm.executeUpdate();
            System.out.println("Update successfully into fabricFinishing table");
        } catch (SQLException ex) {
            Logger.getLogger(BuyingThread2DaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public FabricFinishing6 getFabricFinishingById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public FabricFinishing6 getFabricFinishingByFinishingName(String name) {

        FabricFinishing6 fabricFinishing6 = null;
        String sql = "Select * from fabricFinishing where fabric_name = ?";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, name);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                FabricFinishing6 fabricFinishing = new FabricFinishing6(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getDouble(4), rs.getDouble(5), rs.getString(6), rs.getDate(7));
            }
        } catch (SQLException ex) {
            Logger.getLogger(BuyingThread2DaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return fabricFinishing6;
    }

    @Override
    public void dalete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<FabricFinishing6> getList() {

        List<FabricFinishing6> list = new ArrayList();
        String sql = "select * from fabricFinishing";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                FabricFinishing6 fabricFinishing6 = new FabricFinishing6(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getDouble(5), rs.getDouble(6), rs.getString(7), rs.getDate(8));
                list.add(fabricFinishing6);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BuyingThread2DaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

}
