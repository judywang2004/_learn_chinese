import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubString {


    public static void main(String[] args){
        int[] chars = new int[128];
        int left =0;
        int right =0;

        String s ="abcdeafbdgcbb";
        LongestSubString lss= new LongestSubString();
       // lss.bruteForce(s);
       // lss.slindingWindow(s);
        lss.lengthOfLongestSubstring(s);

    }
    /** A1: Brute Force
     * Check all the substring one by one to see if it has no duplate character
     * */
    public int bruteForce(String s){
        int res = 0;
        int n = s.length();

        for (int i=0;i<n-1;i++){
            for (int j=i;j<n;j++){
                if(bruteForceCheckRepetition(s,i,j)){
                    res = Math.max(res,j-i+1);
                }
            }
        }
        System.out.println(res);

        return res;
    }

    private boolean bruteForceCheckRepetition(String s, int start, int end){
        Set<Character> chars = new HashSet<>();

        for(int i=start;i<=end;i++){
            char c =s.charAt(i);
            if(chars.contains(c))
                return false;
            chars.add(c);
        }

        return true;
    }

    /** A2: Sliding window
     *Given a substring with a fixed end index in the string, maintain a HashMap to record the frequency of each character in the current substring. If any character occurs more than once,
     *  drop the leftmost characters until there are no duplicate characters.
     */

    public int slindingWindow(String s){
        s="abcdeafbdgcbb"; //ans=7,"eafbdgc"
        int ans =0;
        int n=s.length();

        Map<Character,Integer> map = new HashMap<>();

        for(int j=0,i=0;j<n;j++){
            if(map.containsKey(s.charAt(j))){
                i=Math.max(map.get(s.charAt(j)),i);//left repitition
            }

            ans = Math.max(ans,j-i+1);
            map.put(s.charAt(j),j+1);
        }

        System.out.println(ans);

        return ans;
    }
    /** A3 :
     * */
    public int lengthOfLongestSubstring(String s) {
        s="abcdeafbdgcbb"; //ans=7,"eafbdgc"
        Integer[] chars = new Integer[128];

        int left = 0;
        int right = 0;

        int res = 0;
        while (right < s.length()) {
            char r = s.charAt(right);

            Integer index = chars[r]; // didn't get this line?
            if (index != null && index >= left && index < right) {
                left = index + 1;
            }

            res = Math.max(res, right - left + 1);

            chars[r] = right;
            right++;
        }

        System.out.println(res);
        return res;
    }

}
