package Classwork;
import java.util.*;
public class Map3 {
    static Map<String,Double> cart=new HashMap<>();
    static void add(String product,double price){cart.put(product,price);}
    static void remove(String product){cart.remove(product);}
    static void find(String product){
        if(cart.containsKey(product)) System.out.println("Product Exist");
        else System.out.println("Product doesn't Exist");
    }
    static void update(String product,double price){cart.put(product,price);}
    static void display(){
        System.out.println("Shopping Cart");
        System.out.println("-------------");
        for(Map.Entry<String,Double> entry:cart.entrySet())
            System.out.println(entry.getKey()+": "+entry.getValue());
    }
    static void total(){
        double total=0;
        for(double price:cart.values()) total+=price;
        System.out.println("Total: "+total);
    }
    static void highest(){
        String product="";
        double price=0;
        for(Map.Entry<String,Double> entry:cart.entrySet()){
            if(entry.getValue()>price){
                price=entry.getValue();
                product=entry.getKey();
            }
        }
        System.out.println("Most Expensive = "+product);
    }
    public static void main(String[] args){
        add("Laptop",55000);
        add("Mouse",800);
        add("Keyboard",1500);
        add("Headphone",2500);
        display();
        System.out.println();
        remove("Headphone");
        find("Laptop");
        update("Mouse",1000);
        total();
        highest();
    }
}