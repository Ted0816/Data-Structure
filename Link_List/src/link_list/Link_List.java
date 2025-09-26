/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package link_list;



/**
 *
 * @author andre
 */
public class Link_List {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Playlist playlist = new Playlist();
        playlist.addSong("Song A");
        playlist.addSong("Song B");
        playlist.addSong("Song C");
        playlist.nextSongs();
        playlist.previousSongs();
        playlist.deleteSong("Song B");
        playlist.nextSongs();

        System.out.println();

        // Test Student Queue
        StudentQueue queue = new StudentQueue();
        queue.enqueue("Alice");
        queue.enqueue("Bob");
        queue.enqueue("Charlie");
        queue.displayQueue();   
        queue.dequeue();
        queue.displayQueue();  

        System.out.println();

        // Test Palindrome Checker
        PalindromeChecker checker = new PalindromeChecker();
        String word = "madam";
        for (char c : word.toCharArray()) {
            checker.insertChar(c);
        }
        System.out.println("Is '" + word + "' a palindrome? " + checker.isPalindrome());
    }
}