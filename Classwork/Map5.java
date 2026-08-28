package Classwork;
import java.util.*;
public class Map5 {
    public static void main(String[] args){
        Map<Character,Integer> m = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Word: ");
        String s = sc.nextLine();
        for(int i = 0; i < s.length(); i++) m.put(s.charAt(i),m.getOrDefault(s.charAt(i),0)+1);
        for(Map.Entry<Character,Integer> entry: m.entrySet()) System.out.println(entry.getKey()+": "+entry.getValue());
        sc.close();
    }
}
