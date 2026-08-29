package Classwork;
interface Square{void area(int a);}
interface Rectangle{void area(int a, int b);}
interface Circle{void area(long r);}
interface Triangle{void area(float val,int h, int b);}
public class Lambda1 {
    public static void main(String[] args){
        Square s = new Square() {public void area(int a) {System.out.println("Area: "+a*a);}};
        Rectangle r = new Rectangle() {public void area(int a, int b){System.out.println("Area: "+a*b);}};
        Circle c = new Circle() {public void area(long r){System.out.println("Area: "+(3.14*r*r));}};
        Triangle t = new Triangle(){public void area(float val, int h, int b){System.out.println("Area: "+(val*h*b));}};
        s.area(10);
        r.area(5, 10);
        c.area(7);
        t.area(0.5f, 5, 10);
    }
}
