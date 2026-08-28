package Classwork;
import java.util.*;
public class Map1 {
    static HashMap<String,Integer> d = new HashMap<>();
    static void add(String name, int price){
        d.put(name,price);
    }
    static void display(){
        for(String s:d.keySet()) System.out.println(s+": "+d.get(s));
    }
    public static void main(String[] args){
        add("Idli", 10);
        add("Dosa", 40);
        add("Parotta", 15);
        display();
    }
}
