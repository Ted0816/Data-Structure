/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.activity_5;

/**
 *
 * @author POGZ INTERNET CAFE
 */
public class Stack {
        int maxSize;
    int top;
    String[] stack;

    public Stack(int size) {
        maxSize = size;
        stack = new String[maxSize];
        top = -1;
    }

    public void push(String value) {
        if (isFull())
            System.out.println("Stack Overflow");
        else
            stack[++top] = value;
    }

    public String pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return null;
        }
        return stack[top--];
    }

    public String peek() {
        if (isEmpty()) return null;
        return stack[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }

    public void display() {
        for (int i = 0; i <= top; i++)
            System.out.print(stack[i] + " ");
        System.out.println();
    }

  
}
