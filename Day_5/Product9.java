package Day_5;
abstract class Product{
    int productId, price;
    String productName;
    Product(int productId, String productName, int price){
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }
    void getProductId(){
        System.out.println("Product ID: "+productId+"\n");
    }
    void getProductName(){
        System.out.println("Product Name: "+productName+"\n");
    }
    void getPrice(){
        System.out.println("Price: "+price+"\n");
    }
    abstract void calculateDiscount();
}
class Electronics extends Product{
    Electronics(int productId, String productName, int price){
        super(productId, productName, price);
    }
    void calculateDiscount(){
        System.out.println("Discount Price: "+price*0.1+"\n");
    }
}
class Clothing extends Product{
    Clothing(int productId, String productName, int price){
        super(productId, productName, price);
    }
    void calculateDiscount(){
        System.out.println("Discount Price: "+price*0.2+"\n");
    }
}
class Grocery extends Product{
    Grocery(int productId, String productName, int price){
        super(productId, productName, price);
    }
    void calculateDiscount(){
        System.out.println("Discount Price: "+price*0.05+"\n");
    }
}
public class Product9  {
    public static void main(String[] args){

    }
}