/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.activity_7;

/**
 *
 * @author POGZ INTERNET CAFE
 */
public class Task {
       String description;
    int priority;

    public Task(String description, int priority) {
        this.description = description;
        this.priority = priority;
    }

    public String toString() {
        return "[Priority " + priority + "] " + description;
    }
}
