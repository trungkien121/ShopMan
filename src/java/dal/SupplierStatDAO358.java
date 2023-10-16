/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Supplier358;
import model.SupplierStat358;

/**
 *
 * @author Admin
 */
public class SupplierStatDAO358 extends DBContext{
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    public List<Supplier358> SearchSupplier(Date dateIn, Date dateOut){
        String query = "";
        List<Supplier358> list = new ArrayList<>();
        try {
            ps = connection.prepareStatement(query);
            rs = ps.executeQuery();
            while(rs.next()){
                Supplier358 supplier358 = new Supplier358(rs.getInt("id"), 
                        rs.getString("name"), 
                        rs.getString("note"));
                list.add(supplier358);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SupplierStatDAO358.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    
    public List<SupplierStat358> ListImport(int supplierId, Date dateIn, Date dateOut){
        List<SupplierStat358> list = new ArrayList<>();
        String query = "";
        
        try {
            ps = connection.prepareStatement(query);
            rs = ps.executeQuery();
            while(rs.next()){
                SupplierStat358 supplierStat358 = new SupplierStat358(
                        rs.getInt("id"), 
                        rs.getInt("anount"), 
                        rs.getString("importgood"));
                list.add(supplierStat358);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SupplierStatDAO358.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    
    
}
