package Classwork;
import java.util.*;
class Employeee{
    Stack<String> name = new Stack<>();
    Stack<Integer> id = new Stack<>();
    void add(String a, int b){
        name.push(a);
        id.push(b);
    }
    void display(){
        Stack<String> n = (Stack<String>) name.clone();
        Stack<Integer> i = (Stack<Integer>) id.clone();
        while(!n.isEmpty()) System.out.println("Name: "+n.pop()+", ID: "+i.pop());
    }
}
public class Stack3 {
    public static void main(String[] args){
        Employeee e = new Employeee();
        e.add("Jayavikash",1);
        e.add("Dhyanesh",2);
        e.add("Varun", 3);
        e.add("Dharaheshh", 4);
        e.add("Akshay", 5);
        e.display();
    }
}