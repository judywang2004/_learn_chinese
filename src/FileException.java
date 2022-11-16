package oca8;

import java.io.FileNotFoundException;
import java.io.IOException;

public class FileException {
    public void print(){
        try{
            throw new FileNotFoundException();
        }catch(IOException ioe){
            System.out.print("A");
        }catch(FileNotFoundException fnfe){
            System.out.print("B");
        } finally{
            System.out.print("C");
        }
    }
    public static void main(String... args){
        new FileException().print();
    }
}
