/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Bill358;
import model.Booking358;

/**
 *
 * @author Admin
 */
public class BillDAO358 extends DBContext{

    PreparedStatement ps = null;
    ResultSet rs = null;
    
    public List<Bill358> ShowBill(int customerId){
        List<Bill358> list = new ArrayList<>();
        String query = "";
        try {
            ps = connection.prepareStatement(query);
            rs = ps.executeQuery();
            while(rs.next()){
                Bill358 bill358 = new Bill358(rs.getInt("id"),
                        rs.getDate("bookday"),
                        rs.getDate("paymentDate"), 
                        rs.getInt("amount"), 
                        rs.getLong("price"), 
                        rs.getString("note"), 
                        rs.getInt("bookingId"), 
                        rs.getInt("sellerId"), 
                        rs.getInt("customerId"));
                list.add(bill358);
            }
            return list;
        } catch (Exception e) {
        }       
        return null;   
    }
    
    public Booking358 ShowDetailBill(int bookingId){
        String query = "";
        
        try {
            ps = connection.prepareStatement(query);
            rs = ps.executeQuery();
            while(rs.next()){
                Booking358 booking358 = new Booking358(rs.getInt("id"), 
                        rs.getInt("totalAmount"), 
                        rs.getLong("price"), 
                        rs.getString("note"), 
                        rs.getInt("customerId"));
                return booking358;
            }
        } catch (SQLException ex) {
            Logger.getLogger(BillDAO358.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
