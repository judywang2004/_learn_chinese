package oca8;

public class Exception2 {
    
    public static void doSomthing() throws Exception{
        try{
            throw new Exception();
        }finally{
            System.out.println("exception");
        }
    }

    public static void main(String...args) throws Exception{
        doSomthing();
    }
}

// output:
// exception
// Exception in thread "main" java.lang.Exception
//         at oca8.Exception2.doSomthing(Exception2.java:7)
//         at oca8.Exception2.main(Exception2.java:14)