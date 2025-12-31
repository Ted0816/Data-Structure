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
    static Scanner ted = new Scanner(System.in);
    static Stack<Book> borrowedStack = new Stack<>();
    static ArrayList<Book> books = new ArrayList<>();
    static HashMap<Integer, Book> bookMap = new HashMap<>();
    static ArrayList<Book> returnedBooks = new ArrayList<>();   
   

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\nLibrary Inventory");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Display All Books");
            System.out.println("4. Search Book Title");
            System.out.println("5. Search Book ID");
            System.out.println("6. Sort Books Title");
            System.out.println("7. Sort Books Year");
            System.out.println("8. Sort Books ID");
            System.out.println("9. Borrow Book");
            System.out.println("10. View Recently Borrowed Books");
            System.out.println("11. return Books");
            System.out.println("12. View returned Books");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = ted.nextInt();

            switch (choice) {
                case 1:
                    addBook();
                    break;
                case 2:
                    removeBook();
                case 3:
                    displayBooks();
                    break;
                case 4:
                     searchByTitle();
                case 5:                                    
                    searchByID();
                    break;
                case 6:
                    sortByTitle();
                    break;
                case 7:
                    sortByYear();
                    break;
                    case 8:
                    sortByID();
                    break;
                case 9:
                     borrowBook();
                     break;
                case 10:
                    viewBorrowed();
                    break;
                case 11:
                    returnBook();
                    break;
                case 12:
                     viewReturnedBooks();
                     break;
                case 0:
                    System.out.println("Exit");
                    break;                   
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 0);
    }

    static void addBook() {
        System.out.print("Enter ID: ");
        int id = ted.nextInt();
        ted.nextLine();
        System.out.print("Enter Title: ");
        String title = ted.nextLine();
        System.out.print("Enter Author: ");
        String author = ted.nextLine();
        System.out.print("Enter Year: ");
        int year = ted.nextInt();

        Book b = new Book(id, title, author, year);
        books.add(b);
        bookMap.put(id, b);
        System.out.println("Book added successfully.");
    }

    static void removeBook() {
        System.out.print("Enter Book ID to remove: ");
        int id = ted.nextInt();
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
        ted.nextLine();
        System.out.print("Enter title: ");
        String key = ted.nextLine();
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
        int id = ted.nextInt();
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
    static void sortByID() {
        for (int i = 0; i < books.size(); i++) {
            int min = i;
            for (int j = i + 1; j < books.size(); j++) {
                if (books.get(j).year < books.get(min).year)
                    min = j;
            }
            Collections.swap(books, i, min);
        }
        System.out.println("Books sorted by ID.");
    }

    static void borrowBook() {
        System.out.print("Enter Book ID to borrow: ");
        int id = ted.nextInt();
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
    static void returnBook() {
    if (borrowedStack.isEmpty()) {
        System.out.println("No borrowed books.");
        return;
    }

    System.out.print("Enter Book ID to return: ");
    int id = ted.nextInt();
    boolean found = false;

    // Look for the book in the borrowed stack
    for (int i = 0; i < borrowedStack.size(); i++) {
        Book b = borrowedStack.get(i);
        if (b.id == id) {
            borrowedStack.remove(i);  // Remove from borrowed stack
            books.add(b);  // Add the book back to available books
            System.out.println("Book returned successfully.");
            found = true;
            break;
        }
    }

    if (!found) {
        System.out.println("Book not found in borrowed books.");
    }
}static void viewReturnedBooks() {
    if (returnedBooks.isEmpty()) {
        System.out.println("No books have been returned yet.");
    } else {
        System.out.println("Returned books:");
        for (Book b : returnedBooks) {
            b.display();
        }
    }
}
}
