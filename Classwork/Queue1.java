package Classwork;
import java.util.*;
public class Queue1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String cur = "";
        Queue<String> binary = new LinkedList<>();
        Queue<String> q = new LinkedList<>();
        q.offer("1");
        binary.offer("1");
        for(int i = 2; i <= n; i++){
            if(i%2 == 0){
                cur = q.poll();
                q.offer(cur+"0");
                binary.offer(cur+"0");
            }
            else{
                q.offer(cur+"1");
                binary.offer(cur+"1");
            }
        }
        sc.close();
    }
}