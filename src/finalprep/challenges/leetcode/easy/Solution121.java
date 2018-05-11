package finalprep.challenges.leetcode.easy;

/**
 *
 * @author adb
 */
public class Solution121{

  public int maxProfit(int[] prices){
    int min = 0, diff = 0;

    if(prices.length > 1){
      min = prices[0];

      for(int ix = 1; ix < prices.length; ix++){
        int currDiff = 0;

        min = Math.min(min, prices[ix - 1]);
        currDiff = (prices[ix] - min);
        diff = Math.max(diff, currDiff);
      }
    }

    return (diff > 0) ? diff : 0;
  }
}
