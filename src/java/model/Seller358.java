/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Admin
 */
public class Seller358 extends User358{
    private int SellerID;
    private String note;

    public Seller358() {
    }

    public Seller358(int SellerID, String note) {
        this.SellerID = SellerID;
        this.note = note;
    }

    public int getSellerID() {
        return SellerID;
    }

    public void setSellerID(int SellerID) {
        this.SellerID = SellerID;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
    
    
}
