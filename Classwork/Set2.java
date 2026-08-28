package Classwork;
import java.util.*;
public class Set2 {
    public static void main(String[] args) {
        String[] atmTransactions = {"A101","A102","A103","A101","A104","A105","A103","A106"};
        String[] onlineTransactions = {"A101","A103","A105","A107","A108"};
        String[] blockedAccounts = {"A103","A108"};
        String[] suspiciousAccounts = {"A101","A103","A105","A107"};
        Set<String> atm = new HashSet<>();
        Set<String> online = new HashSet<>();
        Set<String> blocked = new HashSet<>();
        Set<String> suspicious = new HashSet<>();
        Set<String> result = new HashSet<>();
        for (String i : atmTransactions){
            if(!atm.contains(i)) atm.add(i);
        }
        for (String i : onlineTransactions) online.add(i);
        for (String i : blockedAccounts) blocked.add(i);
        for (String i : suspiciousAccounts) suspicious.add(i);
        for (String i : atm) {
            if (online.contains(i) && !blocked.contains(i) && suspicious.contains(i)) {
                result.add(i);
            }
        }
        System.out.println(result);
    }
}