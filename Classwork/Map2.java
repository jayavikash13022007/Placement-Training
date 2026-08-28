package Classwork;
import java.util.*;
public class Map2 {
    static Map<Integer,Integer> m = new HashMap<>();
    static void add(int StudentID, int marks){m.put(StudentID,marks);}
    static void get(int StudentID){System.out.println("StudentId: "+StudentID+", Marks: "+m.get(StudentID));}
    static void update(int StudentID, int marks){m.put(StudentID,marks);}
    static void highest(){
        int StudentID = 0, marks = 0;
        for(Map.Entry<Integer,Integer> entry: m.entrySet()){
            if(entry.getValue() > marks){
                marks = entry.getValue();
                StudentID = entry.getKey();
            }
        }
        System.out.println("StudentId: "+StudentID+", Marks: "+marks);
    }
    static void moreThan75(){
        for(Map.Entry<Integer,Integer> entry: m.entrySet()){
            if(entry.getValue() > 75) System.out.println("StudentID: "+entry.getKey()+", Marks: "+entry.getValue());
        }
    }
    static void average(){
        int total = 0;
        for(int i: m.values()) total += i;
        System.out.println("Average Marks: "+(float)total/m.size());
    }
    static void find(int StudentID){
        if(m.containsKey(StudentID)) System.out.println("StudentID Exist");
        else System.out.println("StudentID doesn't Exist");
    }
    public static void main(String[] args){
        add(1, 80);
        add(2, 81);
        add(3, 73);
        add(4, 95);
        get(4);
        update(4, 96);
        highest();
        moreThan75();
        average();
        find(5);
    }
}