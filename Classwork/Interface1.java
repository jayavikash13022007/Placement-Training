package Classwork;
interface A{
    void a();
    void b();
}
public class Interface1 {
    public static void main(String[] args){
        A a = new A(){
            public void a(){System.out.println("Hello World");}
            public void b(){System.out.println("I like Pizza");}
        };
    }
}
