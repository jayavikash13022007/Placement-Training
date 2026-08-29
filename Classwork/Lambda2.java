package Classwork;
import java.util.*;
public class Lambda2 {
    public static void main(String[] args){
        List<Integer> lst = new ArrayList<>(List.of(3,1,4,2,5));
        System.out.println(lst);
        lst.sort((a,b) -> a-b);
        System.out.println(lst);
    }
}