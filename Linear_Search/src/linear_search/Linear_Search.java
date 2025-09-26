/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package linear_search;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author andre
 */
public class Linear_Search {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
             Scanner scanner = new Scanner(System.in);

        // Example student ID list (unsorted)
        int[] studentIDs = {6, 210, 356, 478, 512, 630,2,44,56,71,63,5};

        // Display the list
        System.out.print("Student ID list: ");
        for (int id : studentIDs) {
            System.out.print(id + " ");
        }
        System.out.println();

        // Input: Target ID to search
        System.out.print("Enter the student ID to search: ");
        int targetID = scanner.nextInt();

        // Process: Perform Linear Search
        int position = linearSearch(studentIDs, targetID);

        // Output: Result
        if (position != -1) {
            System.out.println("Student ID " + targetID + " found at position " + position + ".");
        } else {
            System.out.println("Student ID " + targetID + " not found.");
        }
        scanner.close();
    }

    // ✅ You forgot this part — Define the linearSearch method!
    public static int linearSearch(int[] data, int target) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == target) {
                return i; // Return index where found
            }
        }
        return -1; // Not found
    }
}