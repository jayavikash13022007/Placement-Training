package Classwork;
import java.util.*;
public class Exception3 {
    static void add(int a, int b) throws Exception{
        if(b == 0){
            throw new Exception("Divide by Zero Error");
        }
        else{
            System.out.println("Result = "+(a/b));
        }
    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Numerator: ");
        int a = s.nextInt();
        System.out.print("Enter the Denominator: ");
        int b = s.nextInt();
        try{
            add(a,b);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
