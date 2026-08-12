package Classwork;
class Shapes{
    void area(){System.out.println("Area of the Shapes");}
    void area(int a){System.out.println("Area of Square: "+a*a);}
    void area(int a, int b){System.out.println("Area of Rectangle: "+a*b);}
    void area(float a, int b, int c){System.out.println("Area of Triangle: "+a*b*c);}
    void area(double a, int b){System.out.println("Area of Circle: "+a*b*b);}
}
public class Overloading1{
    public static void main(String args[]){
        Shapes s = new Shapes();
        s.area();
        s.area(10);
        s.area(5,10);
        s.area(0.5f,5,10);
        s.area(3.14,5);
    }
}