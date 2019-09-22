/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.daoImpl;

import com.coderbd.conn.ProductBDConnection;
import com.coderbd.dao.BuyingThread2Dao;
import com.coderbd.pojo.BuyingThread2;

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
public class BuyingThread2DaoImpl implements BuyingThread2Dao {

    static Connection conn = ProductBDConnection.getConnection();

    public static void main(String[] args) {
        ProductBDConnection.getConnection();
    }

    @Override
    public void ctreateTable() {

        String sql = "create table IF NOT EXISTS buyingThread(id int (11) auto_increment primary key, thread_name varchar(50),thread_qty int(11), thread_color varchar(50),unit_price double, total_price double, buying_date date, import_company varchar(50))";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            System.out.println("buyingThread table created");
        } catch (SQLException ex) {
            Logger.getLogger(BuyingThread2DaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void save(BuyingThread2 bt) {

        String sql = "insert into buyingThread(thread_name ,thread_qty, thread_color ,unit_price, total_price, buying_date , import_company) values (?,?,?,?,?,?,?)";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, bt.getThreadName());
            pstm.setInt(2, bt.getThreadQuantity());
            pstm.setString(3, bt.getThreadColor());
            pstm.setDouble(4, bt.getUnitPrice());
            pstm.setDouble(5, bt.getTotalPrice());
            pstm.setDate(6, new java.sql.Date(bt.getBuyingdate().getTime()));
            pstm.setString(7, bt.getImportCompany());
            pstm.executeUpdate();
            System.out.println("Inset successfully into buyingThread table");
        } catch (SQLException ex) {
            Logger.getLogger(BuyingThread2DaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(BuyingThread2 bt) {
        String sql = "update buyingThread set thread_name = ? where id = ?";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, bt.getThreadName());
            pstm.setInt(2, bt.getThreadQuantity());
            pstm.setString(3, bt.getThreadColor());
            pstm.setDouble(4, bt.getUnitPrice());
            pstm.setDouble(5, bt.getTotalPrice());
            pstm.setDate(6, new java.sql.Date(bt.getBuyingdate().getTime()));
            pstm.setString(7, bt.getImportCompany());
            pstm.executeUpdate();
            System.out.println("Update successfully into buyingThread table");
        } catch (SQLException ex) {
            Logger.getLogger(BuyingThread2DaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public BuyingThread2 getBuyingThreadById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public BuyingThread2 getBuyingThreadByThreadName(String name) {

        BuyingThread2 uyingThread2 = null;
        String sql = "Select * from buyingThread where thread_name = ?";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, name);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                BuyingThread2 buyingThread2 = new BuyingThread2(rs.getString(1), rs.getInt(2), rs.getString(3), rs.getDouble(4), rs.getDouble(5), rs.getDate(6), rs.getString(7));
            }
        } catch (SQLException ex) {
            Logger.getLogger(BuyingThread2DaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return uyingThread2;
    }

    @Override
    public void dalete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<BuyingThread2> getList() {

        List<BuyingThread2> list = new ArrayList();
        String sql = "select * from buyingThread";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                BuyingThread2 buyingThread2 = new BuyingThread2(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getDouble(5), rs.getDouble(6), rs.getDate(7), rs.getString(8));
                list.add(buyingThread2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BuyingThread2DaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

}
