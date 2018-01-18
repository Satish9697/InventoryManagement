package com.demo.Model;

/**
 * Created by gsati on 1/17/2018.
 */
public class Inventory {
    String itemName;
    double sellingPrice;
    double buyPrice;
    int quantity;

    public Inventory() {
    }


    public Inventory(String itemName, double sellingPrice, double buyPrice, int quantity) {
        this.itemName = itemName;
        this.sellingPrice = sellingPrice;
        this.buyPrice = buyPrice;
        this.quantity = quantity;
    }


    public String getItemName() {
        return itemName;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(double buyPrice) {
        this.buyPrice = buyPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
