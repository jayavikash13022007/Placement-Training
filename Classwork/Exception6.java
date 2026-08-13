package Classwork;
class InvalidPasswordException extends Exception{
    InvalidPasswordException(String s){
        super(s);
    }
}
class Password{
    private String password;
    void SetPassword(String password) throws Exception{
        try{
            if(password.length() < 8) throw new InvalidPasswordException("Password must be at least 8 characters long");
            this.password = password;
        }
        catch(InvalidPasswordException e){
            throw e;
        }
    }
}
public class Exception6 {
    public static void main(String args[]){
        Password p = new Password();
        try{
            p.SetPassword("IlikePizza");
        }
        catch(Exception e){System.out.println(e);}
    }
}
