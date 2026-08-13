package Classwork;
class InvalidMarkException extends Exception{
    InvalidMarkException(String s){
        super(s);
    }
}
class Student{
    private int mark;
    void GetMark(int mark) throws Exception{
        try{
            if(mark < 0 || mark > 100) throw new InvalidMarkException("Invalid Mark");
            this.mark = mark;
        }
        catch(InvalidMarkException e){
            throw e;
        }
    }
}
public class Exception5 {
    public static void main(String args[]){
        Student s = new Student();
        try{
            s.GetMark(120);
        }
        catch(Exception e){System.out.println(e);}
    }
}
