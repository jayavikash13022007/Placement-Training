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
public class Product5 {
    public static void main(String[] args){

    }
}