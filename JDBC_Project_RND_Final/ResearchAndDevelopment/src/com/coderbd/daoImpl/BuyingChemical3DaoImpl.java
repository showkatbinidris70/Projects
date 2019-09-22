/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.daoImpl;

import com.coderbd.conn.ProductBDConnection;
import com.coderbd.dao.BuyingChemical3Dao;
import com.coderbd.pojo.BuyingChemical3;

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
public class BuyingChemical3DaoImpl implements BuyingChemical3Dao {

    public static void main(String[] args) {
        ProductBDConnection.getConnection();
    }

    static Connection conn = ProductBDConnection.getConnection();

    @Override
    public void ctreateTable() {

        String sql = "create table IF NOT EXISTS buyingChemical(id int(11) auto_increment primary key, chemical_name varchar(50),chemical_qty int(11), unit_price double, total_price double, buying_date date, import_company varchar(50), expired_date date)";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            System.out.println("buyingChemical Table Created");
        } catch (SQLException ex) {
            Logger.getLogger(BuyingChemical3DaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void save(BuyingChemical3 bc) {

        String sql = "insert into buyingChemical(chemical_name ,chemical_qty, unit_price ,total_price,  buying_date , import_company, expired_date) values (?,?,?,?,?,?,?)";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, bc.getChemicalName());
            pstm.setInt(2, bc.getChemicalQuantity());
            pstm.setDouble(3, bc.getUnitPrice());
            pstm.setDouble(4, bc.getTotalPrice());
            pstm.setDate(5, new java.sql.Date(bc.getBuyingdate().getTime()));
            pstm.setString(6, bc.getImportCompany());
            pstm.setDate(7, new java.sql.Date(bc.getExpiredDate().getTime()));
            pstm.executeUpdate();
            System.out.println("Inset successfully into buyingChemical table");
        } catch (SQLException ex) {
            Logger.getLogger(BuyingThread2DaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(BuyingChemical3 bc) {
        String sql = "update buyingChemical set chemical_name = ? where id = ?";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, bc.getChemicalName());
            pstm.setInt(2, bc.getChemicalQuantity());
            pstm.setDouble(3, bc.getUnitPrice());
            pstm.setDouble(4, bc.getTotalPrice());
            pstm.setDate(5, new java.sql.Date(bc.getBuyingdate().getTime()));
            pstm.setString(6, bc.getImportCompany());
            pstm.setDate(7, new java.sql.Date(bc.getExpiredDate().getTime()));
            pstm.executeUpdate();
            System.out.println("Update successfully into buyingChemical table");
        } catch (SQLException ex) {
            Logger.getLogger(BuyingThread2DaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public BuyingChemical3 getBuyingChemicalById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public BuyingChemical3 getBuyingChemicalByChemaicalName(String name) {

        BuyingChemical3 buyingChemical3 = null;
        String sql = "Select * from buyingChemical where chemical_name = ?";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, name);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                BuyingChemical3 buyingChemical = new BuyingChemical3(rs.getString(1), rs.getInt(2), rs.getDouble(3), rs.getDouble(4), rs.getDate(5), rs.getString(6), rs.getDate(7));
            }
        } catch (SQLException ex) {
            Logger.getLogger(BuyingThread2DaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return buyingChemical3;
    }

    @Override
    public void dalete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<BuyingChemical3> getList() {

        List<BuyingChemical3> list = new ArrayList();
        String sql = "select * from buyingChemical";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                BuyingChemical3 buyingChemical3 = new BuyingChemical3(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getDouble(4), rs.getDouble(5), rs.getDate(6), rs.getString(7), rs.getDate(8));
                list.add(buyingChemical3);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BuyingThread2DaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;

    }

}
