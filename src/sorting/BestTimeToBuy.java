import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int maxProfit(int k, int[] prices) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        int p1,p2=0;
        // int[] prices = {3,2,6,5,0,3};
        for (int i=0;i<prices.length-1;i++){
            p1 = prices[i];
            for(int j=i; j<prices.length;j++){
                p2=prices[j];
                if (prices[j]-prices[i] > 0){
                    al.add(p2-p1);
                }
            }
        }
        Collections.sort(al, Collections.reverseOrder());
        int sum =0;
        for (int m=0;m<k;m++){
            sum = sum +al.get(m);
        }
        return sum;
    }

    public static void main(String args[]){
        Solution sl = new Solution();
        int[] prices = {3,2,6,5,0,3};
        sl.maxProfit(2,prices);
    }
}