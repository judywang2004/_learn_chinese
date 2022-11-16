package oca8;

import java.util.Optional;
public class ExceptionDemo{
    public static void main(String[] args){
        String a=null;
        Optional<String> b = Optional.empty();
        try{
            System.out.print("Try:a = "+a.length());
            System.out.print("Try:b = "+b.orElse("").length());

        }catch(Exception ex){
            System.out.println("Catch: "+a);
        }finally{
            a="String";
            System.out.println("Final:a "+a.length());
            b=Optional.ofNullable("");
            System.out.print("Final:b "+b.get().length());

        }
        // output is :
        // Catch: null
        // Final:a 6
        // Final:b 0%

    }

    void print(String s){
        System.out.println(s);
    }
}

