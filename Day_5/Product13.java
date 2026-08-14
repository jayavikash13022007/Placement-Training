package Day_5;
class InvalidPriceException extends Exception{
    InvalidPriceException(String s){
        super(s);
    }
}
abstract class Product{
    int productId;
    private int price;
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
    int price(){
        return price;
    }
    void setPrice(int price){
        try{
            if(price <= 0) throw new InvalidPriceException("Invalid Price Value");
            this.price = price;
            System.out.println("Price set to "+price);
        }
        catch(InvalidPriceException e){
            System.out.println(e);
        }
    }
    abstract void calculateDiscount();
}
class Electronics extends Product{
    Electronics(int productId, String productName, int price){
        super(productId, productName, price);
    }
    void calculateDiscount(){
        System.out.println("Discount Price: "+price()*0.1+"\n");
    }
    void finalPrice(){
        System.out.println("Final Price: "+price()*0.9+"\n");
    }
}
class Clothing extends Product{
    Clothing(int productId, String productName, int price){
        super(productId, productName, price);
    }
    void calculateDiscount(){
        System.out.println("Discount Price: "+price()*0.2+"\n");
    }
    void finalPrice(){
        System.out.println("Final Price: "+price()*0.8+"\n");
    }
}
class Grocery extends Product{
    Grocery(int productId, String productName, int price){
        super(productId, productName, price);
    }
    void calculateDiscount(){
        System.out.println("Discount Price: "+price()*0.05+"\n");
    }
    void finalPrice(){
        System.out.println("Final Price: "+price()*0.95+"\n");
    }
}
public class Product13 {
    public static void main(String[] args){

    }
}