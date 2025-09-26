/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication5;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author andre
 */
public class JavaApplication5 {

    /**
     * @param args the command line arguments
     */
      public static void main(String[] args) {
         
           List<Integer> arr1 = new ArrayList<>();
             arr1.add(2);
        arr1.add(3);
        System.out.println("Original arr1: " + arr1);
        NewClass.insertAtPosition(arr1, 1, 10);  // Qualified call to static method
        System.out.println("After insert: " + arr1);  // Expected: [2, 10, 3]
        // Task 2: Delete at Position
        List<Integer> arr2 = new ArrayList<>();
        arr2.add(1);
        arr2.add(2);
        arr2.add(3);
        arr2.add(4);
        System.out.println("Original arr2: " + arr2);
        NewClass.deleteAtPosition(arr2, 1);  // Qualified call to static method
        System.out.println("After delete: " + arr2);  // Expected: [1, 3, 4]
        // Task 3: Find Max and Min
        List<Integer> arr3 = new ArrayList<>();
        arr3.add(3);
        arr3.add(1);
        arr3.add(4);
        arr3.add(1);
        arr3.add(5);
        System.out.println("Original arr3: " + arr3);
        int[] result = NewClass.findMaxMin(arr3);  // Qualified call to static method
        System.out.println("Max and Min: " + result[0] + " " + result[1]);  // Expected: 5 1
    }
}