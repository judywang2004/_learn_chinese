package general;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FibonacciTest {

	/*
	 * Code a program that prints the Fibonacci sequence with a ceiling of 200.
	 */


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print("Print the Fibonacci sequence with a ceiling of 200.");
		
		int number =200, i=1;		
		while(fibRecursion(i)<=number) {
			print(fibRecursion(i)+" ");
			i++;
		}
		print(" ... End Method 1 : using recursion  ...");
		
		
		fibLoop(number);
		print(" ... End Method 2: using loop ...");
		
		fibStream(number);
		print(" ... End Method 3: using Stream ...");
	}
	
	//Method 1: Fibonacci number using recursion
	public static int fibRecursion(int number) {		
		return (number==1 || number==2) ? 1 : ( fibRecursion(number-1)+fibRecursion(number-2));
	}
	
	//Method 2: while loop
	public static void  fibLoop(int number) {
		int num1=1,num2=1;
		while(num1 <=number) {
			print(num1+ " ");
			int sum = num1 + num2;
			num1 = num2;
			num2 = sum;
		}		
	}
	
	// Method 3 : Stream
	public static void fibStream(int number) {
		Stream.iterate(new int[] {1,1},p-> new int[] {p[1],p[0]+p[1]})				
		      .limit(12).forEach(p -> print(p[0]));
	
	}
	
	private static void print(Object  number) {
		System.out.println(number);
	}

}
