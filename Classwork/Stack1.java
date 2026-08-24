package Classwork;
import java.util.*;
public class Stack1 {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        Stack<Integer> s = new Stack<>();
        int ch = 0;
        System.out.print("1. Push\n2. Pop\n3. Peek\n4. Is Empty\n-1. Exit");
        while(ch != -1){
            System.out.print("Enter your choice: ");
            ch = sc.nextInt();
            switch(ch){
                case 1:
                    System.out.print("Enter the element: ");
                    int a = sc.nextInt();
                    s.push(a);
                    System.out.println(a+" is pushed"); break;
                case 2:
                    if(s.isEmpty()) System.out.println("Stack is empty");
                    else{
                        System.out.println(s.peek()+" is popped");
                        s.pop(); 
                    } break;
                case 3:
                    if(s.isEmpty()) System.out.println("Stack is empty");
                    else System.out.println(s.peek()+" is the topmost element"); break;
                case 4:
                    System.out.println(s.isEmpty()); break;
            }
        }
        sc.close();
    }
}
