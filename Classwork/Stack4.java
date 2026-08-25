package Classwork;
import java.util.*;
public class Stack4 {
    public static void main(String[] args) {
        String infix = "A*B+(C-D)/E%F";
        String reversedInfix = "";
        for (int i = infix.length() - 1; i >= 0; i--) {
            reversedInfix += infix.charAt(i);
        }
        String postfix = "";
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < reversedInfix.length(); i++) {
            char c = reversedInfix.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                postfix += c;
            } else if (c == ')') { 
                stack.push(c);
            } else if (c == '(') {
                while (!stack.isEmpty() && stack.peek() != ')') {
                    postfix += stack.pop();
                }
                stack.pop();
            } else {
                while (!stack.isEmpty() && precedence(c) <= precedence(stack.peek())) {
                    postfix += stack.pop();
                }
                stack.push(c);
            }
        }
        while (!stack.isEmpty()) {
            postfix += stack.pop();
        }
        StringBuilder result = new StringBuilder();
        for (int i = postfix.length() - 1; i >= 0; i--) {
            result.append(postfix.charAt(i));
        }
        System.out.println("Postfix: " + result.toString());
    }

    static int precedence(char c) {
        switch (c) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
            case '%':
                return 2;
            default:
                return 0;
        }
    }
}