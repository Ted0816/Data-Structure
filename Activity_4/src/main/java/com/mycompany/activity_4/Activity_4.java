/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.activity_4;

/**
 *
 * @author POGZ INTERNET CAFE
 */
public class Activity_4 {

    public static void main(String[] args) {
                      
        System.out.println("=== Binary Tree Test ===");

        Stack tree = new Stack();
        tree.insert(16);
        tree.insert(20);
        tree.insert(30);
        tree.insert(70);
        tree.insert(40);
        tree.insert(100);
        tree.insert(80);

        System.out.println("Tree Height: " + tree.findHeight(tree.root));
        System.out.println("Number of Leaves: " + tree.countLeaves(tree.root));


        System.out.println("\n=== Student BST Test ===");

        BST bst = new BST();
        bst.insert(2024-0175-6, "Ted");
        bst.insert(2024-0175-5, "Andrei");
        bst.insert(2024-0175-4, "Josef");
        bst.insert(2024-0175-3, "Ading");

        System.out.println("Search ID 2024-0175-6: " + bst.search(2024-0175-6));
        System.out.println("Search ID 2024-0175-5: " + bst.search(2024-0175-5));
        System.out.println("Search ID 2024-0175-1: " + bst.search(2024-0175-1));

        System.out.println("\nInorder Traversal:");
        bst.inorder(bst.root);

     
        System.out.println("\nTree Test");

        SearchTree expTree = new SearchTree();

        String postfix = "3 9 + 2 * 7 /";
        SearchTree.TreeNode root = expTree.buildTree(postfix);

        System.out.print("Inorder Expression: ");
        expTree.inorder(root);

        System.out.println("\nEvaluated Result: " + expTree.evaluate(root));
    }
}
