package oca8;

public class Exception3 {
    public static void main (String args[]){
        try{
            System.out.print("A");
            throw new RuntimeException("out of bounds");
        }catch(ArrayIndexOutOfBoundsException aio){
            System.out.print("B");
            throw aio;
        }finally{
            System.out.print("C");
        }
    }
}
// output:
// ACException in thread "main" java.lang.RuntimeException: out of bounds