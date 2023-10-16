/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.BillSupplier358;

/**
 *
 * @author Admin
 */
public class BillSupplierDAO358 extends DBContext{
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    public BillSupplier358 ShowBillSupplier(int supplierId, Date dateIn, Date dateOut){
        BillSupplier358 billSupplier358 = new BillSupplier358();
        String query = "";
        
        try {
            ps = connection.prepareStatement(query);
            rs = ps.executeQuery();
            while(rs.next()){
                billSupplier358 = new BillSupplier358(rs.getInt("id"), 
                        rs.getDate("starday"), 
                        rs.getDate("starday"), 
                        rs.getInt("amount"), 
                        rs.getInt("productId"),
                        rs.getInt("supplierId"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(BillSupplierDAO358.class.getName()).log(Level.SEVERE, null, ex);
        }
        return billSupplier358;
    }
}
