package Classwork;
import java.util.*;
public class Exception1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter numerator: ");
        int a = s.nextInt();
        System.out.print("Enter denominator: ");
        int b = s.nextInt();
        try{
            System.out.println("Result = "+a/b);
        }
        catch(Exception e){
            System.out.println("Zero Division Error");
        }
    }
}
