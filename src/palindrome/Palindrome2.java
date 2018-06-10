package palindrome;


public class Palindrome2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String original="abcba1";
		
		int length = original.length();
		int begin,i,end,middle;
		begin=0;
		end=length-1;
		middle=(begin+end)/2;
		
		for(i=begin;i<=middle;i++){
			if (original.charAt(begin)==original.charAt(end)){
				begin++;
				end--;
			}
			else break;
			
		}
		
		if (i==middle+1)
			System.out.println("Palindrome");
		else
			System.out.println("Not a Palindrome");
		
		
	}

}
