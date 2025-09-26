/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication5;

import java.util.List;

/**
 *
 * @author andre
 */
public class NewClass {
     public static void insertAtPosition(List<Integer> list, int position, int value) {
        if (position < 0 || position > list.size()) {
            throw new IllegalArgumentException("Position out of bounds");
        }
        if (position == list.size()) {
            list.add(value);  // Add at the end
            return;
        }

        list.add(0);  // Grow the list
        for (int i = list.size() - 2; i >= position; i--) {
            list.set(i + 1, list.get(i));  // Shift right
        }
        list.set(position, value);  // Insert value
    }

    public static void deleteAtPosition(List<Integer> list, int position) {
        if (list.isEmpty() || position < 0 || position >= list.size()) {
            throw new IllegalArgumentException("Position out of bounds or list is empty");
        }

        for (int i = position; i < list.size() - 1; i++) {
            list.set(i, list.get(i + 1));  // Shift left
        }

        list.remove(list.size() - 1);  // Remove last duplicate
    }

    public static int[] findMaxMin(List<Integer> list) {
        if (list.isEmpty()) {
            return new int[]{-1, -1};  // Sentinel for empty list
        }

        int max = list.get(0);
        int min = list.get(0);

        for (int i = 1; i < list.size(); i++) {
            int current = list.get(i);
            if (current > max) {
                max = current;
            }
            if (current < min) {
                min = current;
            }
        }

        return new int[]{max, min};
    }
}