package Classwork;
import java.util.*;
class Printer{
    String name, task;
    Printer(String name, String task){
        this.name = name;
        this.task = task;
    }
    void display(){
        System.out.println("Name: "+name+", Task: "+task);
    }
}
public class Queue2 {
    public static void main(String[] args){
        Printer p1 = new Printer("Printer1", "task1");
        Printer p2 = new Printer("Printer2", "task2");
        Printer p3 = new Printer("Printer3", "task3");
        Printer p4 = new Printer("Printer4", "task4");
        Printer p5 = new Printer("Printer5", "task5");
        Printer[] p = {p1,p2,p3,p4,p5};
        Queue<Printer> q = new LinkedList<>();
        System.out.print("Enter the order from 1-5 to add the Printers: ");
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < p.length; i++) q.offer(p[sc.nextInt()-1]);
        for(int i = 0; i < p.length; i++) q.poll().display();
        sc.close();
    }
}
