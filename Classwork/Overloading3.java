package Classwork;
class Vehicle{
    String name, brand;
    long rent;
    float rate;
    int days = 0, time = 0;
    void vehicle(){System.out.println("Bus Car Bike Van Lorry");}
    void vehicle(int days){System.out.println("Bus 1000 per day");name = "Bus";rent = 1000;this.days = days;}
    void vehicle(String num, int days){System.out.println("Car 500 per day");name = "Car";rent = 500;this.days = days;}
    void vehicle(int amount, String num, String time){System.out.println("Bike 250 per day");name = "Bike";rent = 250;this.time = Integer.parseInt(time);}
    void vehicle(int amount, String num, int days){System.out.println("Van 750 per day");name = "Van";rent = 750;this.days = days;}
    void vehicle(int amount, String num,String time, int days){System.out.println("Lorry 1500 per day");name = "Lorry";rent = 1500;this.days = days;this.time = Integer.parseInt(time);}
    void rent_calculations(){
        switch(name){
            case "Bus": System.out.println("Bus rent + Fuel(2.5%)"); break;
            case "Car": System.out.println("Car rent + Fuel(3.7%)"); break;
            case "Bike": System.out.println("Bike rent + Fuel(5.0%)"); break;
            case "Van": System.out.println("Van rent + Fuel(4.5%)"); break;
            case "Lorry": System.out.println("Lorry rent + Fuel(6.3%)"); break;
        }
    }
    
}
class Hour_rent extends Vehicle{
    void rent_calculations(){
        switch(name){
            case "Bus": System.out.println("Bus rent = "+(rent + rent*0.025f)*time/24); break;
            case "Car": System.out.println("Car rent = "+(rent + rent*0.037f)*time/24); break;
            case "Bike": System.out.println("Bike rent = "+(rent + rent*0.05f)*time/24); break;
            case "Van": System.out.println("Van rent = "+(rent + rent*0.045f)*time/24); break;
            case "Lorry": System.out.println("Lorry rent = "+(rent + rent*0.063f)*time/24); break;
        }
    }
}
class Day_rent extends Vehicle{
    void rent_calculations(){
        switch(name){
            case "Bus": System.out.println("Bus rent = "+(rent + rent*0.025f)*days); break;
            case "Car": System.out.println("Car rent = "+(rent + rent*0.037f)*days); break;
            case "Bike": System.out.println("Bike rent = "+(rent + rent*0.05f)*days); break;
            case "Van": System.out.println("Van rent = "+(rent + rent*0.045f)*days); break;
            case "Lorry": System.out.println("Lorry rent = "+(rent + rent*0.063f)*days); break;
        }
    }
}
public class Overloading3 {
    public static void main(String args[]){

    }
}
