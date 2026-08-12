package Classwork;
class BankAccount{
    void deposit(int amount){System.out.println("Amount: "+amount);}
    void deposit(int amount, String description){System.out.println("Amount: "+amount+"\nDescription: "+description);}
    void deposit(int amount, String description, int id_no){System.out.println("Amount: "+amount+"\nDescription: "+description+"\nID: "+id_no);}
}
class Savings extends BankAccount{
    void interest_calculation(int rate, int amount){System.out.println("Interest Rate: "+rate*amount);}
}
class Current extends BankAccount{
    void interest_calculation(int rate, int amount){System.out.println("Interest Rate: "+rate*amount);}
}
public class Overloading2 {
    public static void main(String args[]){
        BankAccount b = new BankAccount();
        b.deposit(1000);
        b.deposit(2000, "Salary");
        b.deposit(3000, "Bonus", 12345);
        Savings s = new Savings();
        s.interest_calculation(5, 1000);
        Current c = new Current();
        c.interest_calculation(3, 1000);
    }
}
