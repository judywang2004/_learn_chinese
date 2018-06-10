
package reverse_number;
import java.util.Scanner;

/**
 * 
 * Java reverse an int value - Principles

    Modding (%) the input int by 10 will extract off the rightmost digit. example: (1234 % 10) = 4.
    Multiplying an integer by 10 will "push it left" exposing a zero to the right of that number, example: (5 * 10) = 50.
    Dividing an integer by 10 will remove the rightmost digit. (
 *
 */

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n, reverse = 0;
		System.out.println("Enter a number to reverse");
		//Scanner in = new Scanner(System.in);
		//n= in.nextInt();
		n=new Integer ("12345");
		
		while(n!=0){
			reverse= reverse*10;
			System.out.println("reversing.. "+reverse);
			reverse = reverse+n%10;
			System.out.println("reversing.. "+reverse);
			n=n/10;
		}
		
		System.out.println("reversed number is "+reverse);

	}

}
