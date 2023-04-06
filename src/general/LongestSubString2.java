import java.util.HashMap;

/**
 * Find the longest substring without repeatly characters
 * input S = "abcabcbb"
 * output : 3
 * input S= "pwwkew"
 * output : 3  "wke"
 */
public class LongestSubString2 {
    HashMap<String,Integer> hm = new HashMap<String,Integer>();
    
    public static void main(String args[]){
        String s ="abcdeafbdgcbb";
        LongestSubString2 lss2= new LongestSubString2();
        lss2.find(s);

    }

    public void find(String s){
        int max =0;
        int l,r=0;
        char[] temp = new char[128];
        temp = s.toCharArray();
       

        for (int i=0;i<=s.length();i++){
            //check if s.charAt[i] not exist in hm, then add it
            if(check(s.charAt(i),hm)){ //if exist
                max = Math.max(max,i-hm.get(String.valueOf(s.charAt(i)))); 
                hm.replace(String.valueOf(s.charAt(i)),i); // replace with the lastest repeat index
                

            }else{ // not exist in hashmap
                hm.put(String.valueOf(s.charAt(i)),i);

            }

        }

        System.out.println("find longest is "+res);

    }
    public boolean check(char ch, HashMap<String,Integer> h){
        boolean isExists = false;
        if(h.containsKey(ch))
            return true;

        return isExists;

    }



}
