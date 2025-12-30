/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.activity_5;

/**
 *
 * @author POGZ INTERNET CAFE
 */
public class Queue {
      int maxSize;
    int front, rear;
    String[] queue;

    public Queue(int size) {
        maxSize = size;
        queue = new String[maxSize];
        front = 0;
        rear = -1;
    }

    public void enqueue(String value) {
        if (isFull())
            System.out.println("Queue Full");
        else
            queue[++rear] = value;
    }

    public String dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Empty");
            return null;
        }
        return queue[front++];
    }

    public String peek() {
        if (isEmpty()) return null;
        return queue[front];
    }

    public boolean isEmpty() {
        return front > rear;
    }

    public boolean isFull() {
        return rear == maxSize - 1;
    }

    public void display() {
        for (int i = front; i <= rear; i++)
            System.out.print(queue[i] + " ");
        System.out.println();
    }
}

