package SingletonTest;

import java.util.Scanner;

public class Ikmtest82 {
	
	public static void main(String[] args) {
		
//		
//		StringBuilder str= new StringBuilder();
//		for(String arg:args){
//			if(str.indexOf(arg)<1)
//				str.append(arg+" ");
//		}
//		System.out.println(str.toString());
//		Scanner sc= new Scanner(str.toString());
//		while(sc.hasNext()){
//			if(sc.hasNextInt())
//				System.out.print(sc.nextInt()+" ");
//			else
//				sc.next();
//		}
		Double d=null;
		System.out.println((d instanceof Double)? "true" :"false");
		int c=0;
		System.out.println((0==c++)? "true" :"false");
		boolean b= false;
		System.out.println((b=true)? "true" :"false");
		String e="1";
		System.out.println(("1" != e)? "true" :"false");
		int a=0;
		System.out.println((a !=0)? "true" :"false");
		
		StringBuilder sb= new StringBuilder("buffering");
		sb.replace(2, 7, "BUFFER");
		System.out.println(sb.toString());
		sb.delete(2, 4);
		System.out.println(sb.toString());
		String s = sb.substring(1, 5);
		System.out.println(s);
	}
	
}
