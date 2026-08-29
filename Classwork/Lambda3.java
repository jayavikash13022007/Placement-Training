package Classwork;
import java.util.*;
class Product{String name;int price;String category;
    Product(String name, int price, String category){this.name = name;this.price = price;this.category = category;}}
public class Lambda3 {
    static void print(String str){System.out.println(str);}
    static void print(List<Product> lst){for(Product p: lst){System.out.println("Name: "+p.name+", Price: "+p.price+", Category: "+p.category);}}
    public static void main(String[] args){
        Comparator<Product> c = (a,b) -> a.category.compareTo(b.category);
        List<Product> lst = new ArrayList<Product>(List.of(
            new Product("Laptop", 90000, "Electronics"),
            new Product("Sofa", 30000, "Home Applicances"),
            new Product("Chicken", 300, "Food")));
        print("Before:");
        print(lst);
        lst.sort(c);
        print("After: ");
        print(lst);
    }
}
