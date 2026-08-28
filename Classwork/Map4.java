package Classwork;
import java.util.*;
public class Map4 {
    static Map<String,String> contacts=new HashMap<>();
    static void add(String name,String number){contacts.put(name,number);}
    static void search(String name){
        if(contacts.containsKey(name))
            System.out.println(name+" → "+contacts.get(name));
        else
            System.out.println("Contact not found");
    }
    static void update(String name,String number){contacts.put(name,number);}
    static void remove(String name){contacts.remove(name);}
    static void display(){
        System.out.println("Contacts");
        System.out.println("--------");
        for(Map.Entry<String,String> entry:contacts.entrySet())
            System.out.println(entry.getKey()+": "+entry.getValue());
    }
    static void findName(String name){
        if(contacts.containsKey(name)) System.out.println("Name Exists");
        else System.out.println("Name doesn't Exist");
    }
    static void findNumber(String number){
        if(contacts.containsValue(number)) System.out.println("Phone Number Exists");
        else System.out.println("Phone Number doesn't Exist");
    }
    public static void main(String[] args){
        add("Jayavikash","9876543210");
        add("Varun","9123456780");
        add("Dhyanesh","9988776655");
        add("Akshay","9000011111");
        display();
        search("Varun");
        update("Dhyanesh","9876501234");
        findName("Akshay");
        findNumber("9988776655");
        remove("AKshay");
        display();
    }
}