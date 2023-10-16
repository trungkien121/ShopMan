/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Admin
 */
public class SupplierStat358 extends Supplier358{
    private  int statid;
    private int anount;
    private String importgood;

    public SupplierStat358() {
    }

    public SupplierStat358(int statid, int anount, String importgood) {
        this.statid = statid;
        this.anount = anount;
        this.importgood = importgood;
    }

    public int getStatid() {
        return statid;
    }

    public void setStatid(int statid) {
        this.statid = statid;
    }

    public int getAnount() {
        return anount;
    }

    public void setAnount(int anount) {
        this.anount = anount;
    }

    public String getImportgood() {
        return importgood;
    }

    public void setImportgood(String importgood) {
        this.importgood = importgood;
    }

   
    
    
}
