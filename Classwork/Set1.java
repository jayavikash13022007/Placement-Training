package Classwork;
import java.util.*;
public class Set1 {
    public static void main(String[] args) {
        String[] registeredCustomers = {"C101","C102","C103","C101","C104","C105","C103","C106"};
        String[] todayPurchases = {"C101","C103","C107","C108"};
        Set<String> duplicates = new HashSet<>();
        Set<String> purchases = new HashSet<>();
        Set<String> result = new HashSet<>();
        for (String i : registeredCustomers){
            if(!duplicates.contains(i)) duplicates.add(i);
        }
        for (String i : todayPurchases) purchases.add(i);
        for (String i : duplicates) {
            if (purchases.contains(i)) result.add(i);
        }
        System.out.println(result);
    }
}