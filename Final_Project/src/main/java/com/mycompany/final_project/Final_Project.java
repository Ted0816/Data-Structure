/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.final_project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author POGZ INTERNET CAFE
 */
public class Final_Project {
    static ArrayList<Book> books = new ArrayList<>();
    static HashMap<Integer, Book> bookMap = new HashMap<>();
    static Stack<Book> borrowedStack = new Stack<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n--- Library Inventory Menu ---");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Display All Books");
            System.out.println("4. Search Book by Title");
            System.out.println("5. Search Book by ID");
            System.out.println("6. Sort Books by Title");
            System.out.println("7. Sort Books by Year");
            System.out.println("8. Borrow Book");
            System.out.println("9. View Recently Borrowed Books");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> addBook();
                case 2 -> removeBook();
                case 3 -> displayBooks();
                case 4 -> searchByTitle();
                case 5 -> searchByID();
                case 6 -> sortByTitle();
                case 7 -> sortByYear();
                case 8 -> borrowBook();
                case 9 -> viewBorrowed();
                case 0 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice!");
            }
        } while (choice != 0);
    }

    static void addBook() {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Title: ");
        String title = sc.nextLine();
        System.out.print("Enter Author: ");
        String author = sc.nextLine();
        System.out.print("Enter Year: ");
        int year = sc.nextInt();

        Book b = new Book(id, title, author, year);
        books.add(b);
        bookMap.put(id, b);
        System.out.println("Book added successfully.");
    }

    static void removeBook() {
        System.out.print("Enter Book ID to remove: ");
        int id = sc.nextInt();
        Book b = bookMap.remove(id);
        if (b != null) {
            books.remove(b);
            System.out.println("Book removed.");
        } else {
            System.out.println("Book not found.");
        }
    }

    static void displayBooks() {
        for (Book b : books) {
            b.display();
        }
    }

    static void searchByTitle() {
        sc.nextLine();
        System.out.print("Enter title: ");
        String key = sc.nextLine();
        for (Book b : books) {
            if (b.title.equalsIgnoreCase(key)) {
                b.display();
                return;
            }
        }
        System.out.println("Book not found.");
    }

    static void searchByID() {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        Book b = bookMap.get(id);
        if (b != null)
            b.display();
        else
            System.out.println("Book not found.");
    }

    static void sortByTitle() {
        for (int i = 0; i < books.size() - 1; i++) {
            for (int j = 0; j < books.size() - i - 1; j++) {
                if (books.get(j).title.compareToIgnoreCase(books.get(j + 1).title) > 0) {
                    Collections.swap(books, j, j + 1);
                }
            }
        }
        System.out.println("Books sorted by title.");
    }

    static void sortByYear() {
        for (int i = 0; i < books.size(); i++) {
            int min = i;
            for (int j = i + 1; j < books.size(); j++) {
                if (books.get(j).year < books.get(min).year)
                    min = j;
            }
            Collections.swap(books, i, min);
        }
        System.out.println("Books sorted by year.");
    }

    static void borrowBook() {
        System.out.print("Enter Book ID to borrow: ");
        int id = sc.nextInt();
        Book b = bookMap.get(id);
        if (b != null) {
            borrowedStack.push(b);
            System.out.println("Book borrowed.");
        } else {
            System.out.println("Book not found.");
        }
    }

    static void viewBorrowed() {
        if (borrowedStack.isEmpty()) {
            System.out.println("No borrowed books.");
        } else {
            for (Book b : borrowedStack) {
                b.display();
            }
        }
    }
}

