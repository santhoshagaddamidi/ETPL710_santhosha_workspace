package com.evergent.corejava.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.evergent.corejava.bean.*;

public class GadgetDAO {
    Connection con = null;
    PreparedStatement pstmt = null;

    public int addGadget(GadgetBean gadget) {
        try {
            con = GadgetDBConnection.getConnection();
            String ins_str = "INSERT INTO gadgets (gadgetId, gadgetName, model, price, stockQuantity) VALUES (?, ?, ?, ?, ?)";
            pstmt = con.prepareStatement(ins_str);
            pstmt.setInt(1, gadget.getGadgetId());
            pstmt.setString(2, gadget.getGadgetName());
            pstmt.setString(3, gadget.getModel());
            pstmt.setDouble(4, gadget.getPrice());
            pstmt.setInt(5, gadget.getStockQuantity());
            int updateCount = pstmt.executeUpdate();
            con.close();
            return updateCount;
        } catch (Exception ex) {
            System.out.println(ex.toString());
            return 0;
        }
    }

    public String showGadget(int gadgetId) {
        try {
            con = GadgetDBConnection.getConnection();
            String details = "";
            String ins_str = "SELECT * FROM gadgets WHERE gadgetId = ?";
            pstmt = con.prepareStatement(ins_str);
            pstmt.setInt(1, gadgetId);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                details = "ID: " + rs.getInt(1) + ", Name: " + rs.getString(2) + ", Model: " + rs.getString(3) + 
                          ", Price: " + rs.getDouble(4) + ", Stock: " + rs.getInt(5);
            }
            con.close();
            return details;
        } catch (Exception e) {
            System.out.println(e.toString());
            return null;
        }
    }

    public int updateStock(int gadgetId, int stock) {
        try {
            con = GadgetDBConnection.getConnection();
            String ins_str = "UPDATE gadgets SET stockQuantity = ? WHERE gadgetId = ?";
            pstmt = con.prepareStatement(ins_str);
            pstmt.setInt(1, stock);
            pstmt.setInt(2, gadgetId);
            int rs = pstmt.executeUpdate();
            con.close();
            return rs;
        } catch (Exception e) {
            System.out.println(e.toString());
            return 0;
        }
    }

    public int sellGadget(int gadgetId, int qty) {
        try {
            con = GadgetDBConnection.getConnection();
            String ins_str = "UPDATE gadgets SET stockQuantity = stockQuantity - ? WHERE gadgetId = ?";
            pstmt = con.prepareStatement(ins_str);
            pstmt.setInt(1, qty);
            pstmt.setInt(2, gadgetId);
            int rs = pstmt.executeUpdate();
            con.close();
            return rs;
        } catch (Exception e) {
            System.out.println(e.toString());
            return 0;
        }
    }

    public String getTransaction(int gadgetId) {
        try {
            con = GadgetDBConnection.getConnection();
            String tran = "";
            String ins_str = "SELECT transaction FROM gadget_transactions WHERE gadgetId = ?";
            pstmt = con.prepareStatement(ins_str);
            pstmt.setInt(1, gadgetId);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                tran += rs.getString(1) + "\n";
            }
            con.close();
            return tran;
        } catch (Exception e) {
            System.out.println(e.toString());
            return "No transactions available";
        }
    }

    public void addTransaction(int gadgetId, String transaction) {
        try {
            con = GadgetDBConnection.getConnection();
            String ins_str = "INSERT INTO gadget_transactions (gadgetId, transaction) VALUES (?, ?)";
            pstmt = con.prepareStatement(ins_str);
            pstmt.setInt(1, gadgetId);
            pstmt.setString(2, transaction);
            pstmt.executeUpdate();
            con.close();
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }
}