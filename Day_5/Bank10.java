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
    void displayAccountDetails(){
        System.out.println("Bank Name: \t"+bankname);
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Account Holder: "+accountHolderName);
        System.out.println("Mobile Number: \t"+mobileNumber);
        System.out.println("Account Type: \t"+accountType);
        System.out.println("Balance: \t"+balance+"\n");
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
public class Bank10 {
        public static void main(String args[]){
        Bank b1 = new Bank(101, "Jayavikah", 9876543211l, "Savings", 100000);
        Bank b2 = new Bank(102, "Dhyanesh", 9988776655l, "Current", 110000);
        Bank b3 = new Bank(103, "Varun", 9876543210l, "Savings", 105000);
        Bank[] b = {b1,b2,b3};
        for(int i = 0; i < b.length; i++){
            b[i].displayAccountDetails();
        }
    }
}