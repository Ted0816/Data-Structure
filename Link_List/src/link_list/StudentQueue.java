/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package link_list;
import java.util.LinkedList;
import java.util.Queue;
/**
 *
 * @author andre
 */
public class StudentQueue {
     private Queue<String> queue = new LinkedList<>();

    public void enqueue(String student) {
        queue.offer(student);
        System.out.println("Enqueued: " + student);
    }

    public void dequeue() {
        String removed = queue.poll();
        if (removed != null) {
            System.out.println("Dequeued: " + removed);
        } else {
            System.out.println("Queue is empty.");
        }
    }

    public void displayQueue() {
        System.out.println("Current queue: " + queue);
    }
}
