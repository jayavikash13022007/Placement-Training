package Classwork;
import java.util.*;
class Patient{
    String name;
    int severity,arrival_time,age;
    Patient(String name,int severity,int arrival_time,int age){
        this.name=name;
        this.severity=severity;
        this.arrival_time=arrival_time;
        this.age=age;
    }
}
public class Queue4{
    static Comparator<Patient> comparator=(a,b)->{
        if(a.severity!=b.severity)return b.severity-a.severity;
        if(a.arrival_time!=b.arrival_time)return a.arrival_time-b.arrival_time;
        if(ch(a)||ch(b)){
            if(ch(a)&&!ch(b))return -1;
            if(ch(b)&&!ch(a))return 1;
        }
        return a.name.compareTo(b.name);
    };
    static PriorityQueue<Patient> q = new PriorityQueue<>(comparator);
    static boolean ch(Patient a){
        return a.age<12||a.age>65;
    }
    static void add_patient(String name,int severity,int arrival_time,int age){
        q.add(new Patient(name,severity,arrival_time,age));
    }
    static Patient treat_next(){
        return q.poll();
    }
    static Patient peek_next(){
        return q.peek();
    }
    void update_severity(String name,int new_severity){
        for(Patient p:q){
            if(p.name.equals(name)){
                q.remove(p);
                p.severity=new_severity;
                q.add(p);
                return;
            }
        }
    }
    public static void main(String[] args){
        add_patient("AAAA",3,10,8);
        add_patient("BBBB",3,5,40);
        add_patient("CCCC",5,20,30);
        System.out.println(treat_next().name);
        System.out.println(treat_next().name);
        System.out.println(treat_next().name);
    }
}