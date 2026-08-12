package Classwork;
public class Exception4 {
    static void check(int a) throws Exception{
        if(a > 100) throw new Exception(a+" is Out of Bound");
        else System.out.println(a+" is Valid");
    }
    public static void main(String args[]){
        int[] arr = {93,-25,216,86,33,-71,106};
        for(int i = 0; i < arr.length; i++){
            try{
                if(arr[i] < 0) throw new Exception(arr[i]+" is Negative");
                else check(arr[i]);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
}
