package Classwork;
import java.util.*;
public class Bubblesort1 {
    public static void main(String args[]){
        List<Integer> lst = new ArrayList<>(List.of(4,1,2,5,6,3));
        System.out.println("Before Bubble Sort: "+lst);
        for(int i = 0; i < lst.size()-1; i++){
            for(int j = 0; j < lst.size()-1-i; j++){
                if(lst.get(j) > lst.get(j+1)){
                    int temp = lst.get(j);
                    lst.set(j, lst.get(j+1));
                    lst.set(j+1, temp);
                }
            }
        }
        System.out.println("After Bubble Sort: "+lst);
    }
}
