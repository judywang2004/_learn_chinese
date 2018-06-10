package palindrome;

public class Palindrome4_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=153321;
		int rev=0,rmd;
		
		
		while(num>0){
			rmd=num%10; // 取余
			System.out.println("rmd ="+rmd);
			rev=rev*10+rmd;
			num=num/10; //取整
			System.out.println("num ="+num);
		}
		if(rev==num)
			System.out.println(" Palindrome");
		else
			System.out.println("NOt a palindrome");

	}

}
