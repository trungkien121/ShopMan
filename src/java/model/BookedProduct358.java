/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Admin
 */
public class BookedProduct358 {
    private int id;
    private String name;
    private long price;
    private int amount;
    private String note;
    private int product358Id;
    private int booking358Id;

    public BookedProduct358() {
    }

    public BookedProduct358(int id, String name, long price, int amount, String note, int product358Id, int booking358Id) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.note = note;
        this.product358Id = product358Id;
        this.booking358Id = booking358Id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public int getProduct358Id() {
        return product358Id;
    }

    public void setProduct358Id(int product358Id) {
        this.product358Id = product358Id;
    }

    public int getBooking358Id() {
        return booking358Id;
    }

    public void setBooking358Id(int booking358Id) {
        this.booking358Id = booking358Id;
    }

    
}
