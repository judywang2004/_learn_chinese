package oca8;

public class Exception4{
    public void doSomthing() throws Exception{
        try{
            throw new Exception("A");
        }catch (Exception e){
            System.out.print("B");
        }finally{
            System.out.print("C");
        }
    }
    public static void main(String[] somthing){
        try{
        new Exception4().doSomthing();
        }
        catch(Exception e ){

        }
    }
}

//output is BC
