package palindrome;

public class Palindrome5_str_num {
	public static void main(String[] args){
		int num=12321;
		String str="aabbaa";
		Palindrome5_str_num palin = new Palindrome5_str_num();
        int revNum = palin.reverse(num);
        String revStr = palin.reverse(str);
        
        if (num == revNum) {
            System.out.printf("\n The number %d is a Palindrome ", num);
        } else {
            System.out.printf("\n The number %d is not a Palindrome ", num);
        }
        if (str.equalsIgnoreCase(revStr)) {
            System.out.printf("\n The string '%s' is a Palindrome ", str);
        } else {
            System.out.printf("\n The string '%s' is not a Palindrome ", str);
        }

	}
	
	// Method to return the reverse of a number
    public int reverse(int num) {
        int revNum = 0;
        while (num > 0) {
            int rem = num % 10;
            revNum = (revNum * 10) + rem;
            num = num / 10;
        }
        return revNum;
    }
    
    // Method to return the reverse of a string
    public String reverse(String str) {
        StringBuilder revStr = new StringBuilder();
        for (int i = str.length()-1; i >= 0; i--) {
            revStr.append(str.charAt(i));
        }
        return revStr.toString();
    }
    
 /*
  * using stringbuilder.reverse
    */

//String palindrome = "..." // from elsewhere
//boolean isPalindrome = palindrome.equals(new StringBuilder(palindrome).reverse().toString());

    /**
     * reverse :
     * for(int i=0 ; i < word.length()/2;i++)
{
  if(word.charAt(i) ! = word.charAt(word.length()-1-i))

      return false;
}

return true;
}
     * */

    public static final boolean isPalindromeInPlace(String string) {
        char[] array = string.toCharArray();
        int length = array.length-1;
        int half = Math.round(array.length/2);
        char a,b;
        for (int i=length; i>=half; i--) {
            a = array[length-i];
            b = array[i];
            if (a != b) return false;
        }
        return true;
    }
    
}
