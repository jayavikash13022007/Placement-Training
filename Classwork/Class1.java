package Classwork;
class Color{
    int id;
    String name;
    boolean fav;
    Color(int id, String name, boolean fav){
        this.id = id;
        this.name = name;
        this.fav = fav;
    }
    void Display(){
        System.out.println("Color id = "+id+"\nColor name = "+name);
        if(fav) System.out.println("Yes, this is my favorite color");
        else System.out.println("No, this is not my favorite color");
    }
}
public class Class1 {
    public static void main(String args[]){
        Color c1 = new Color(1, "black", true);
        Color c2 = new Color(2, "green", false);
        Color c3 = new Color(3, "blue", true);
        Color c4 = new Color(4, "red", false);
        Color c5 = new Color(5, "yellow", true);
        Color[] c = {c1, c2, c3, c4, c5};
        for(int i = 0; i < c.length; i++) c[i].Display();
    }
}
