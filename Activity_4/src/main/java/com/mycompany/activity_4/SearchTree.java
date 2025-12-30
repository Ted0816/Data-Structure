/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.activity_4;

/**
 *
 * @author POGZ INTERNET CAFE
 */
public class SearchTree {

   class TreeNode {
        int data;
        TreeNode left, right;

        TreeNode(int value) {
            data = value;
            left = right = null;
        }
    }

     public TreeNode buildTree(String postfix) {
         java.util.Stack<TreeNode> stack = new java.util.Stack<>();
        String[] tokens = postfix.split(" ");

        for (String token : tokens) {
            if (isOperator(token)) {
                TreeNode right = stack.pop();
                TreeNode left = stack.pop();
                TreeNode node = new TreeNode(token.charAt(0));
                node.left = left;
                node.right = right;
                stack.push(node);
            } else {
                stack.push(new TreeNode(Integer.parseInt(token)));
            }
        }
        return stack.pop();
    }

    private boolean isOperator(String s) {
        return "+-*/".contains(s);
    }

    public void inorder(TreeNode node) {
        if (node != null) {
            inorder(node.left);
            System.out.print((char) node.data + " ");
            inorder(node.right);
        }
    }

    public int evaluate(TreeNode node) {
        if (node.left == null && node.right == null)
            return node.data;

        int left = evaluate(node.left);
        int right = evaluate(node.right);

        switch ((char) node.data) {
            case '+': return left + right;
            case '-': return left - right;
            case '*': return left * right;
            case '/': return left / right;
        }
        return 0;
    }
}