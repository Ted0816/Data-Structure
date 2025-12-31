/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.activty_6;

/**
 *
 * @author POGZ INTERNET CAFE
 */
public class Activty_6 {

    public static void main(String[] args) {
          

       
        int[] grades = {85, 72, 90, 65, 88,99};
        ArraySort.bubbleSort(grades.clone());
        ArraySort.selectionSort(grades.clone());
        ArraySort.insertionSort(grades.clone());

        System.out.println();

      
        String[] names = {"Ted", "Andrei", "Josef", "Geraldino"};
        AlphabeticalSort.selectionSort(names);

        System.out.println();

       
        int[] scores = {16, 21, 03, 12, 02};
        Leaderboard.insertionSortDescending(scores);
    }
}
    
