
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
			System.out.println("reversing1.. "+reverse); //0
			reverse = reverse+n%10;
			System.out.println("reversing2.. "+reverse); //5
			n=n/10;
			System.out.println("reversing3 n = "+n); //1234
		}
		
		System.out.println("reversed number is "+reverse);

	}

}

/**
 * Enter a number to reverse
reversing1.. 0
reversing2.. 5
reversing3 n = 1234
reversing1.. 50
reversing2.. 54
reversing3 n = 123
reversing1.. 540
reversing2.. 543
reversing3 n = 12
reversing1.. 5430
reversing2.. 5432
reversing3 n = 1
reversing1.. 54320
reversing2.. 54321
reversing3 n = 0
reversed number is 54321
 */
