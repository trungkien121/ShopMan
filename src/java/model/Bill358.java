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
public class Bill358 {
    private int id;
    private Date bookday;
    private Date paymentDate;
    private int amount;
    private long price;
    private String note;
    private int bookingId;
    private int sellerId;
    private int customerId;

    public Bill358() {
    }

    public Bill358(int id, Date bookday, Date paymentDate, int amount, long price, String note, int bookingId, int sellerId, int customerId) {
        this.id = id;
        this.bookday = bookday;
        this.paymentDate = paymentDate;
        this.amount = amount;
        this.price = price;
        this.note = note;
        this.bookingId = bookingId;
        this.sellerId = sellerId;
        this.customerId = customerId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getBookday() {
        return bookday;
    }

    public void setBookday(Date bookday) {
        this.bookday = bookday;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public int getSellerId() {
        return sellerId;
    }

    public void setSellerId(int sellerId) {
        this.sellerId = sellerId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    
}
