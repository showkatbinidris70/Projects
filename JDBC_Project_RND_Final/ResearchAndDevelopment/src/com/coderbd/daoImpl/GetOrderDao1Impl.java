package com.coderbd.daoImpl;

import com.coderbd.conn.ProductBDConnection;
import com.coderbd.dao.GetOrderDao1;
import com.coderbd.pojo.GetOrder1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GetOrderDao1Impl implements GetOrderDao1 {

    static Connection conn = ProductBDConnection.getConnection();

    public static void main(String[] args) {
        GetOrderDao1Impl ob = new GetOrderDao1Impl();
        ob.ctreateTable();
    }

    @Override
    public void ctreateTable() {

        String sql = "create table IF NOT EXISTS getOrder(id int(11) auto_increment primary key,order_code varchar(30),product_qty int(11),unit_price double,total_price double,order_date date, delivery_date date)";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            System.out.println("getOrder table Created");
        } catch (SQLException ex) {
            Logger.getLogger(GetOrderDao1Impl.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void save(GetOrder1 g) {
        String sql = "insert into getOrder(order_code,product_qty,unit_price,total_price,order_date, delivery_date) values (?,?,?,?,?,?)";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, g.getOrderCode());
            pstm.setInt(2, g.getProductQuantity());
            pstm.setDouble(3, g.getUnitPrice());
            pstm.setDouble(4, g.getTotalPrice());
            pstm.setDate(5, new java.sql.Date(g.getorderDate().getTime()));
            pstm.setDate(6, new java.sql.Date(g.getorderDate().getTime()));
            pstm.executeUpdate();
            System.out.println("Insert success into order table");

        } catch (SQLException ex) {
            Logger.getLogger(GetOrderDao1Impl.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void update(GetOrder1 g) {

        String sql = "update getOrder set order_code = ? where id = ?";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, g.getOrderCode());
            pstm.setInt(2, g.getProductQuantity());
            pstm.setDouble(3, g.getUnitPrice());
            pstm.setDouble(4, g.getTotalPrice());
            pstm.setDate(5, new java.sql.Date(g.getorderDate().getTime()));
            pstm.setDate(6, new java.sql.Date(g.getorderDate().getTime()));
            pstm.executeUpdate();
            System.out.println(" update success !");

        } catch (SQLException ex) {
            Logger.getLogger(GetOrderDao1Impl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public GetOrder1 getGetOrder1ById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public GetOrder1 getGetOrder1ByGetOrder1Code(String code) {
        GetOrder1 getOrder1 = null;
        String sql = "Select * from GetOrder1 where order_code = ?";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, code);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                getOrder1 = new GetOrder1(rs.getString(1), rs.getInt(2), rs.getDouble(3), rs.getDouble(4), rs.getDate(5), rs.getDate(6));
            }
        } catch (SQLException ex) {
            Logger.getLogger(GetOrderDao1Impl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return getOrder1;
    }

    @Override
    public void dalete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<GetOrder1> getList() {
        List<GetOrder1> list = new ArrayList();
        String sql = "Select * from getOrder";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                GetOrder1 go = new GetOrder1(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getDouble(4), rs.getDouble(5), rs.getDate(6), rs.getDate(7));
                list.add(go);
            }
        } catch (SQLException ex) {
            Logger.getLogger(GetOrderDao1Impl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    @Override
    public List<GetOrder1> getListByOrderCode(String orderCode) {
        List<GetOrder1> list = new ArrayList();
        String sql = "Select * from getOrder where order_code=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, orderCode);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                GetOrder1 go = new GetOrder1(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getDouble(4), rs.getDouble(5), rs.getDate(6), rs.getDate(7));
                list.add(go);
            }
        } catch (SQLException ex) {
            Logger.getLogger(GetOrderDao1Impl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
}
