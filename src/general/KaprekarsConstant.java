import java.util.Arrays;

import javax.lang.model.util.ElementScanner6;

/**
* 1: Arrange the digits in descending order and in ascending order.
* 2:Subtract the smaller number from the bigger number, padding the difference with zeroes if necessary to maintain a four-digit number.
* 3: Then repeat step 1 and 2 using the four-digit difference.
* 4: Stop when the difference of the two, permuted numbers equals 6174.
Return the number of times that you had to perform steps 1 and 2 before arriving at a difference with the value of 6174.
nb: performing the routine on 6174 will always give you 6174 (7641 - 1467 = 6174).

For example: if num is 3524 your program should return 3: (pass 1) 5432 - 2345 = 3087, (pass 2) 8730 - 0378 = 8352, (pass 3) 8532 - 2358 = 6174.
 */
public class KaprekarsConstant {
    public static void main(String[] args){
        int input = 3087;
        System.out.println(KaprekarsConstant(input)); 
    }

    public static int KaprekarsConstant(int in){
        int diff=0;
        int count =0;

        while(diff!=6174){
            String s1 = String.valueOf(in);
            char[] s11 = new char[s1.length()];
            s11 = s1.toCharArray();
            Arrays.sort(s11);
            String s2 = new String(s11); //ascending numerical string
            System.out.println("s2="+s2);
            String s3 ="";
            for(int i=s2.length()-1;i>=0;i--){
                s3 =s3+s2.charAt(i);  //descending string
            }

            int a = Integer.valueOf(s2);
            int b = Integer.valueOf(s3);
            
            if (a>b)
                diff = a-b;
            else if(b>a)
                diff = b-a;
            else{ //a=b
                System.out.println("Goal can NOT be reached");
                break;
            }
            count++;
            in = diff;

        }

        return count;

    }
    

}
