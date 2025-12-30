/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.activity_5;

import java.util.Scanner;

/**
 *
 * @author POGZ INTERNET CAFE
 */
public class Activity_5 {

    public static void main(String[] args) {
            System.out.println("PROBLEM 1: UNDO / REDO");

        Stack undoStack = new Stack(5);
        Stack redoStack = new Stack(5);

        undoStack.push("Type A");
        undoStack.push("Type B");
        undoStack.push("Delete B");

        System.out.print("Undo Stack: ");
        undoStack.display();

       
        String action = undoStack.pop();
        redoStack.push(action);

        System.out.print("Undo Stack: ");
        undoStack.display();

        System.out.print("Redo Stack: ");
        redoStack.display();
     
        undoStack.push(redoStack.pop());

        System.out.print("After Redo - Undo Stack: ");
        undoStack.display();

        
        System.out.println("\nPROBLEM 2: CUSTOMER QUEUE");

        Queue customerQueue = new Queue(5);

        customerQueue.enqueue("Customer 1");
        customerQueue.enqueue("Customer 2");
        customerQueue.enqueue("Customer 3");

        System.out.print("Queue: ");
        customerQueue.display();

        System.out.println("Serving: " + customerQueue.dequeue());

        System.out.print("Queue After Serving: ");
        customerQueue.display();

        
        System.out.println("\nPROBLEM 3: PALINDROME CHECKER");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        Stack stack = new Stack(word.length());
        Queue queue = new Queue(word.length());

        for (char c : word.toCharArray()) {
            stack.push(String.valueOf(c));
            queue.enqueue(String.valueOf(c));
        }

        boolean isPalindrome = true;

        while (!stack.isEmpty() && !queue.isEmpty()) {
            if (!stack.pop().equals(queue.dequeue())) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome)
            System.out.println("Result: Palindrome");
        else
            System.out.println("Result: Not a Palindrome");
    }
}
    

