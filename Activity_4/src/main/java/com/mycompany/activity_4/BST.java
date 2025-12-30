/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.activity_4;

/**
 *
 * @author POGZ INTERNET CAFE
 */
public class BST {
       class StudentNode {
        int id;
        String name;
        StudentNode left, right;

        StudentNode(int id, String name) {
            this.id = id;
            this.name = name;
            left = right = null;
        }
    }

    StudentNode root;

    public void insert(int id, String name) {
        root = insertRecursive(root, id, name);
    }

    private StudentNode insertRecursive(StudentNode node, int id, String name) {
        if (node == null)
            return new StudentNode(id, name);

        if (id < node.id)
            node.left = insertRecursive(node.left, id, name);
        else if (id > node.id)
            node.right = insertRecursive(node.right, id, name);

        return node;
    }

    public boolean search(int id) {
        return searchRecursive(root, id);
    }

    private boolean searchRecursive(StudentNode node, int id) {
        if (node == null) return false;
        if (node.id == id) return true;

        return id < node.id
                ? searchRecursive(node.left, id)
                : searchRecursive(node.right, id);
    }

    public void inorder(StudentNode node) {
        if (node != null) {
            inorder(node.left);
            System.out.println("ID: " + node.id + " | Name: " + node.name);
            inorder(node.right);
        }
    }
}