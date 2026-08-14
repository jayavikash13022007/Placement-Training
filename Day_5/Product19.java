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
    Product(int productId, String productName, int price) throws InvalidPriceException{
        if(price <= 0) throw new InvalidPriceException("Invalid Price Value");
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
    abstract void finalPrice();
    void product(){
        System.out.println("Product Type: None\n");
    }
}
class Electronics extends Product{
    Electronics(int productId, String productName, int price) throws InvalidPriceException{
        super(productId, productName, price);
    }
    void calculateDiscount(){
        System.out.println("Discount Price: "+price()*0.1+"\n");
    }
    void finalPrice(){
        System.out.println("Final Price: "+price()*0.9+"\n");
    }
    void product(){
        System.out.println("Product Type: Electronics\n");
    }
}
class Clothing extends Product{
    Clothing(int productId, String productName, int price) throws InvalidPriceException{
        super(productId, productName, price);
    }
    void calculateDiscount(){
        System.out.println("Discount Price: "+price()*0.2+"\n");
    }
    void finalPrice(){
        System.out.println("Final Price: "+price()*0.8+"\n");
    }
    void product(){
        System.out.println("Product Type: Clothing\n");
    }
}
class Grocery extends Product{
    Grocery(int productId, String productName, int price) throws InvalidPriceException{
        super(productId, productName, price);
    }
    void calculateDiscount(){
        System.out.println("Discount Price: "+price()*0.05+"\n");
    }
    void finalPrice(){
        System.out.println("Final Price: "+price()*0.95+"\n");
    }
    void product(){
        System.out.println("Product Type: Grocery\n");
    }
}
public class Product19 {
    public static void main(String[] args){
        try{
            Product p1 = new Electronics(101, "Bulb", 180);
            Product p2 = new Clothing(102, "Hoodie", 2500);
            Product p3 = new Grocery(103, "Frozen Pizza", 220);
            Product[] p = {p1,p2,p3};
            for(int i = 0; i < p.length; i++){
                p[i].product();
                p[i].getProductId();
                p[i].getProductName();
                p[i].getPrice();
                p[i].calculateDiscount();
                p[i].finalPrice();
            }
        }
        catch(InvalidPriceException e){
            System.out.println(e);
        }
    }
}