package finalprep.challenges.leetcode.arrays.easy;

/**
 *
 * @author adb
 */
public class Solution122{

  public int maxProfit(int[] prices){
    int min = 0, profits = 0;

    if(prices.length > 1){
      min = prices[0];

      for(int ix = 1; ix < prices.length; ix++){
        min = Math.min(min, prices[ix - 1]);

        if(prices[ix] - min > 0){
          profits += prices[ix] - min;
          min = prices[ix];
        }
      }
    }

    return profits;
  }
}
