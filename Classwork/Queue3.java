package Classwork;
import java.util.*;
class Panel{
    int panel_no, no_of_can;
    String interviewer;
    Panel(int panel_no,String interviewer,int no_of_can){
        this.panel_no = panel_no;
        this.interviewer = interviewer;
        this.no_of_can = no_of_can;
    }
}
public class Queue3{
    public static void main(String[] args){
        PriorityQueue<Panel> q = new PriorityQueue<>((a,b) -> a.panel_no - b.panel_no);
        Panel p2 = new Panel(2,"Dhyanesh",7);
        Panel p4 = new Panel(4, "Dharaheshh", 12);
        Panel p1 = new Panel(1, "Jayavikash", 18);
        Panel p5 = new Panel(5, "Akshay", 5);
        Panel p3 = new Panel(3, "Varun", 13);
        q.offer(p2);
        q.offer(p4);
        q.offer(p1);
        q.offer(p5);
        q.offer(p3);
        while(!q.isEmpty()){
            Panel p = q.poll();
            System.out.println("Panel No: "+p.panel_no+"\nInterviewer: "+p.interviewer+"\nNumber of Candidates: "+p.no_of_can+"\n");
            
        }
    }
}