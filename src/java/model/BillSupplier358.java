/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class BillSupplier358 {
    private int id;
    private Date starday;
    private Date enddate;
    private int amount;
    private int  productId;
    private int supplierId;

    public BillSupplier358() {
    }

    public BillSupplier358(int id, Date starday, Date enddate, int amount, int productId, int supplierId) {
        this.id = id;
        this.starday = starday;
        this.enddate = enddate;
        this.amount = amount;
        this.productId = productId;
        this.supplierId = supplierId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getStarday() {
        return starday;
    }

    public void setStarday(Date starday) {
        this.starday = starday;
    }

    public Date getEndate() {
        return enddate;
    }

    public void setEndate(Date endate) {
        this.enddate = endate;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(int supplierId) {
        this.supplierId = supplierId;
    }

    
}
