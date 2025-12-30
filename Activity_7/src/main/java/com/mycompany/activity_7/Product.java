/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.activity_7;

/**
 *
 * @author POGZ INTERNET CAFE
 */
public class Product {
       String name;
    double price;
    int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double totalValue() {
        return price * quantity;
    }

    public String toString() {
        return name + " | ₱" + price + " | Qty: " + quantity;
    }
}

