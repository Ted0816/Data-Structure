/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.activity_7;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author POGZ INTERNET CAFE
 */
public class Activity_7 {

    public static void main(String[] args) {
            System.out.println("STUDENT SYSTEM");

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(1, "Ted", 90));
        students.add(new Student(2, "Andrei", 85));
        students.add(new Student(3, "Josef", 95));

        displayStudents(students);
        
        students.get(1).grade = 88;
        
        removeStudentById(students, 3);
        removeStudentById(students, 2);
       
        Collections.sort(students, (a, b) -> Double.compare(b.grade, a.grade));

        System.out.println("\nAfter Update, Remove, and Sort:");
        displayStudents(students);
       
        System.out.println("\n=== PRODUCT INVENTORY ===");

        ArrayList<Product> products = new ArrayList<>();

        products.add(new Product("Bond Paper",30.50, 20));
        products.add(new Product("Pen",12.00, 50));
        products.add(new Product("Paper",50.00, 5));

        double totalInventoryValue = 0;
        for (Product p : products) {
            System.out.println(p);
            totalInventoryValue += p.totalValue();
        }

        System.out.println("Total Inventory: $" + totalInventoryValue);

        // Sort by price
        Collections.sort(products, (a, b) -> Double.compare(a.price, b.price));

        System.out.println("\nProducts Sorted by Price:");
        for (Product p : products) {
            System.out.println(p);
        }

      
        System.out.println("\nTO-DO LIST");

        ArrayList<Task> tasks = new ArrayList<>();

        tasks.add(new Task(" Devotion ", 1));
        tasks.add(new Task(" DSA ", 3));
        tasks.add(new Task("Review for exam", 2));

        // Sort by priority
        Collections.sort(tasks, (a, b) -> Integer.compare(a.priority, b.priority));

        for (Task t : tasks) {
            System.out.println(t);
        }
    }

    // Helper Methods
    static void displayStudents(ArrayList<Student> list) {
        for (Student v : list) {
            System.out.println(v);
        }
    }

    static void removeStudentById(ArrayList<Student> list, int id) {
        list.removeIf(s -> s.id == id);
    }
}