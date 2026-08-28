package Classwork;
class Threading extends Thread{
    String name;
    Threading(String name){this.name = name;}
    public void run(){
        for(int i = 0; i < 5; i++) System.out.println(name+": "+i);
    }
}
public class Thread1 {
    public static void main(String[] args){
    Threading t1 = new Threading("Thread1");
    Threading t2 = new Threading("Thread2");
    t1.start();
    t2.start();
    }
}
