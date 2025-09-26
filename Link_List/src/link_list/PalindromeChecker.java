/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package link_list;
import java.util.Stack;
/**
 *
 * @author andre
 */
public class PalindromeChecker {
     private Stack<Character> stack = new Stack<>();
    private StringBuilder original = new StringBuilder();

    public void insertChar(char c) {
        stack.push(c);
        original.append(c);
    }

    public boolean isPalindrome() {
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }
        return original.toString().equals(reversed.toString());
    }
}

