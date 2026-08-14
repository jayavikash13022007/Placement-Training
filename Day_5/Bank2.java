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
    long mobileNumber;
    int balance, accountNumber;
    String accountHolderName, accountType;
}
public class Bank2 {
        public static void main(String args[]){
        }
}