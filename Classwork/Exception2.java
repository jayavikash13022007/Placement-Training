package Classwork;
class Bank{
    private int balance = 0;
    void DisplayBalance(){System.out.println("Balance = "+balance);}
    void Deposit(int amount){System.out.println("Amount deposited: "+amount);balance += amount;}
    void Withdraw(int amount){
        try{
            if(amount > balance) throw new Exception("Insufficient Balance");
            else{System.out.println("Amount withdrawn: "+amount);balance -= amount;}
        }
        catch(Exception e){System.out.println(e);}
    }
}
public class Exception2 {
    public static void main(String args[]){
        Bank b = new Bank();
        b.Deposit(10000);
        b.Withdraw(7000);
        b.DisplayBalance();
        b.Deposit(1500);
        b.Withdraw(5000);
    }
}
