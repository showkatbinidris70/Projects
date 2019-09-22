/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.daoImpl;

import com.coderbd.conn.ProductBDConnection;
import com.coderbd.dao.SummaryDao;
import com.coderbd.pojo.Summary;

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
public class SummaryDaoImpl implements SummaryDao {

    static Connection conn = ProductBDConnection.getConnection();

    public static void main(String[] args) {
        SummaryDao sdao = new SummaryDaoImpl();
        sdao.createTable();
    }

    @Override
    public void createTable() {
        String sql = "create table if not exists summary (order_code varchar(50),total_product int(11),knitting int(11), dyeing int(11), finishing int(11), completed_product int(11), order_date date, delivery_date date)";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            System.out.println("Summary table Created");
        } catch (SQLException ex) {
            Logger.getLogger(SummaryDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void save(Summary s) {
        String sql = "insert into summary(order_code,total_product,knitting,dyeing,finishing,completed_product,order_date,delivery_date) values (?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, s.getOrderCode());
            pstm.setInt(2, s.getTotalProduct());
            pstm.setInt(3, s.getKnitting());
            pstm.setInt(4, s.getDyeing());
            pstm.setInt(5, s.getFinishing());
            pstm.setInt(6, s.getCompletedProduct());
            pstm.setDate(7, new java.sql.Date(s.getOrderDate().getTime()));
            pstm.setDate(8, new java.sql.Date(s.getDeliveryDate().getTime()));
            pstm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SummaryDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(Summary s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Summary getProductByCode(String code) {
        Summary summari = null;
        String sql = "select * from summary where order_code code = ?";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, code);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                summari = new Summary(rs.getString(1), rs.getInt(2), rs.getInt(3), rs.getInt(4), rs.getInt(5), rs.getInt(6), rs.getDate(7), rs.getDate(8));
            }
        } catch (SQLException ex) {
            Logger.getLogger(SummaryDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return summari;
    }

    @Override
    public List<Summary> getList() {
        List<Summary> list = new ArrayList();
        String sql = "select * from summary";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                Summary summary = new Summary(rs.getString(1), rs.getInt(2), rs.getInt(3), rs.getInt(4), rs.getInt(5), rs.getInt(6), rs.getDate(7), rs.getDate(8));
                list.add(summary);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SummaryDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

}
