package armstrong;
import java.util.*;

//rmstrong number is a number that is equal to the sum of cubes of its digits for example 0, 1, 153, 370, 371, 407 etc.
/**
153 = (1*1*1)+(5*5*5)+(3*3*3)  
where:  
(1*1*1)=1  
(5*5*5)=125  
(3*3*3)=27  
So:  
1+125+27=153  
*/
/**
 * 
 * Java reverse an int value - Principles

    Modding (%) the input int by 10 will extract off the rightmost digit. example: (1234 % 10) = 4.
    Multiplying an integer by 10 will "push it left" exposing a zero to the right of that number, example: (5 * 10) = 50.
    Dividing an integer by 10 will remove the rightmost digit.example (1234 / 10) = 123 (
 *
 */
public class ArmStrong1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int original=153;
int sum=0,rmd,tmp,digits=0;

tmp=original;
while(tmp!=0){ // get the digits
	digits++;
	tmp=tmp/10;
}

tmp= original;
while(tmp!=0){
	rmd=tmp%10;
	sum=sum+power(rmd,digits);
	tmp=tmp/10;
}
if (original==sum)
   System.out.println("armstrong");



	}
	
	static int power(int n,int r){
		int c,p=1;
		for(c=1;c<=r;c++){
			p=p*n;
		}
		return p;
	}

}
