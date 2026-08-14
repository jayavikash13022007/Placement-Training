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
}
public class Bank3 {
        public static void main(String args[]){
        }
}