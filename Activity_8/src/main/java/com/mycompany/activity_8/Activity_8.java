/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.activity_8;
import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author POGZ INTERNET CAFE
 */
public class Activity_8 {

    public static void main(String[] args) {
             System.out.println("Problem 1: Student Directory");

        HashMap<String, Student> students = new HashMap<>();

        students.put("2024-0175-6", new Student("2024-0175-6", "Ted", 79.5));
        students.put("2024-0175-5", new Student("2024-0175-5", "Andrei", 71.0));
        students.put("2024-0175-4", new Student("2024-0175-4", "Josef", 75.5));
        students.put("2024-0175-3", new Student("2024-0175-3", "Ading", 78.0));
        students.put("2024-0175-2", new Student("2024-0175-2", "TedPaul", 82.0));

        // Retrieve by ID
        System.out.println(students.get("2024-0175-6"));

        // Update grade
        students.get("2024-0175-5").setGrade(75.0);

        for (Map.Entry<String, Student> entry : students.entrySet()) {
            System.out.println(entry.getValue());
        }

      
        System.out.println("\nProblem 2: Library Book Tracker");

        HashMap<String, Integer> library = new HashMap<>();

        library.put("Java Programming", 3);
        library.put("Data Structures", 4);
        library.put("Operating Systems", 2);

        // Borrow
        library.put("Java Programming",
                library.get("Java Programming") - 1);

        // Return
        library.put("Operating Systems",
                library.get("Operating Systems") + 1);

        // Remove book
        library.remove("Data Structures");

        for (Map.Entry<String, Integer> entry : library.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

       
        System.out.println("\nProblem 3: Frequency Counter");

        String sentence = "POGI_PARIN_SA_2026";
        HashMap<Character, Integer> freq = new HashMap<>();

        for (char c : sentence.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
