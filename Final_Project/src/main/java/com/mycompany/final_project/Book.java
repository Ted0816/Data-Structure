/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.final_project;

/**
 *
 * @author POGZ INTERNET CAFE
 */
public class Book {
  
    int id;
    String title;
    String author;
    int year;

    public Book(int id, String title, String author, int year) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public void display() {
        System.out.println(id + " | " + title + " | " + author + " | " + year);
    }
}


