import java.util.HashSet;
import java.util.Set;
/**
 * Given two number 3 ,10.find the total prime number betwen them
 */

public class FindPrimeBetween{

    public static void main(String[] args){
        int l=3,r=12;
        Set<Integer> res = new HashSet<Integer>();

        for(int i=l;i<r;i++){
            if(checkPrime(i)){
                res.add(i);
            }
        }

        System.out.println("Prime number size is: "+res.size() );
        System.out.println("Prime numberes are: "+res.toString() );
        
    }

    public static boolean checkPrime(int num){
        boolean flag = true;

        for(int i=2;i<=num/2;i++){
            //condition for nonprime
            if (num%2 ==0){
                flag =false;
                break;
            }
        }

        return flag;
    }
}