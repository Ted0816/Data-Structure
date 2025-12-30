/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.activity_4;

/**
 *
 * @author POGZ INTERNET CAFE
 */
public class Stack {
    
    class TreeNode {
        int data;
        TreeNode left, right;

        TreeNode(int value) {
            data = value;
            left = right = null;
        }
    }

    TreeNode root;

    public void insert(int value) {
        root = insertRecursive(root, value);
    }

    private TreeNode insertRecursive(TreeNode node, int value) {
        if (node == null)
            return new TreeNode(value);

        if (value < node.data)
            node.left = insertRecursive(node.left, value);
        else if (value > node.data)
            node.right = insertRecursive(node.right, value);

        return node;
    }

    public int findHeight(TreeNode node) {
        if (node == null) return -1;
        return 1 + Math.max(findHeight(node.left), findHeight(node.right));
    }

    public int countLeaves(TreeNode node) {
        if (node == null) return 0;
        if (node.left == null && node.right == null) return 1;
        return countLeaves(node.left) + countLeaves(node.right);
    }
}


