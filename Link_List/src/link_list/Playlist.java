/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package link_list;

import java.util.LinkedList;
import java.util.ListIterator;
/**
 *
 * @author andre
 */
public class Playlist {
    private LinkedList<String> songs = new LinkedList<>();
    private ListIterator<String> iterator = songs.listIterator();

    public void addSong(String song) {
        songs.add(song);
        iterator = songs.listIterator(); // Reset iterator after adding
        System.out.println("Added: " + song);
    }

    public void deleteSong(String song) {
        songs.remove(song);
        iterator = songs.listIterator(); // Reset iterator after removal
        System.out.println("Deleted: " + song);
    }

    public void nextSongs() {
        System.out.println("Next songs:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void previousSongs() {
        System.out.println("Previous songs:");
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
    }
}