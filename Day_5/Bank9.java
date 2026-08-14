package Day_5;
class InvalidWithdrawAmount extends Exception{
    InvalidWithdrawAmount(String s){
        super(s);
    }
}
class InvalidDepositAmount extends Exception{
    InvalidDepositAmount(String s){
        super(s);
    }
}
class Bank{
    static String bankname = "Mariamman Indian Bank";
    private long mobileNumber;
    private int balance, accountNumber;
    private String accountHolderName, accountType;
    Bank(int accountNumber, String accountHolderName, long mobileNumber, String accountType, int balance){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.mobileNumber = mobileNumber;
        this.accountType = accountType;
        this.balance = balance;
    }
    void deposit(int amount){
        try{
            if(amount <= 0){
                throw new InvalidDepositAmount("Invalid Deposit Amount\n");
            }
            else{
                balance += amount;
                System.out.println(amount+" has been deposited\n");
            }
        }
        catch(InvalidDepositAmount e){
            System.out.println(e);
        }
    }
    void withdraw(int amount){
        try{
            if(amount > balance){
                throw new InvalidWithdrawAmount("Insufficient Balance\n");
            }
            else if(amount <= 0){
                throw new InvalidWithdrawAmount("Invalid Withdraw AMount\n");
            }
            else{
                balance -= amount;
                System.out.println(amount+" has been withdrawed\n");
            }
        }
        catch(InvalidWithdrawAmount e){
            System.out.println(e);
        }
    }
    void getBankName(){
        System.out.println("Bank Name: "+bankname+"\n");
    }
    void getAccountNumber(){
        System.out.println("Account Number: "+accountNumber+"\n");
    }
    void getAccountHolderName(){
        System.out.println("Account Holder: "+accountHolderName+"\n");
    }
    void getMobileNumber(){
        System.out.println("Mobile Number: "+mobileNumber+"\n");
    }
    void getAccountType(){
        System.out.println("Account Type: "+accountType+"\n");
    }
    void getBalance(){
        System.out.println("Balance: "+balance+"\n");
    }
    void setMobileNumber(long mobileNumber){
        this.mobileNumber = mobileNumber;
    }
}
public class Bank9 {
        public static void main(String args[]){
        Bank b1 = new Bank(101, "Jayavikah", 9876543211l, "Savings", 100000);
        b1.withdraw(5000);
        b1.withdraw(200000);
        b1.withdraw(-2500);
    }
}