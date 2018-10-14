package finalprep.challenges.leetcode.arrays.easy;

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
        min = Math.min(min, prices[ix - 1]);
        diff = Math.max(diff, (prices[ix] - min));
      }
    }

    return diff;
  }
}
