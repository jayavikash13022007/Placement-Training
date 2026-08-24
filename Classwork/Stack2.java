package Classwork;
import java.util.*;
public class Stack2 {
    public static void main(String[] args){
        Stack<String> word = new Stack<>();
        Stack<Character> letter = new Stack<>();
        System.out.print("Enter the value of n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < n; i++) word.push(sc.nextLine());
        for(int i = 0; i < n; i++){
            String s = word.peek();
            word.pop();
            for(int j = 0; j < s.length(); j++) letter.push(s.charAt(j));
            for(int j = 0; j < s.length(); j++){
                char c = letter.peek();
                letter.pop();
                System.out.print(c);
            }
            System.out.print(" ");
        }
        sc.close();
    }
}
