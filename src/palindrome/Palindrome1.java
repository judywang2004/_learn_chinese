package palindrome;
import java.util.Scanner;

public class Palindrome1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String original,reverse="";
//		Scanner in = new Scanner(System.in);
//		System.out.println("Enter a String to check if it is a palindrome");
//		original=in.nextLine();
		original="abcba1";
		int length= original.length();
		
		for(int i=length-1;i>=0;i--){
			reverse=reverse+original.charAt(i);
		}
		
		if(original.equals(reverse))
			System.out.println("entered is a palingdrom");
		else
			System.out.println("entered is Not a palingdrom");

	}

}
