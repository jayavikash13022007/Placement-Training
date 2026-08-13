package Classwork;
import java.util.*;
public class Arrayseperation {
    public static void main(String args[]){
        List<Integer> lst = new ArrayList<>(List.of(10,11,20,21,30,31,41,40));
        System.out.println("Before Array Seperation "+lst);
        int left = 0;
        for(int right = 0; right < lst.size(); right++){
            if(lst.get(right)%10 != 0){
                int temp = lst.get(right);
                for(int j = right; j > left; j--) lst.set(j, lst.get(j-1));
                lst.set(left, temp);
                left++;
            }
        }
        System.out.println("After Array Seperation "+lst);
    }
}
