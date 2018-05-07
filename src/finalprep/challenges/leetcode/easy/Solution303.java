package finalprep.challenges.leetcode.easy;

import java.util.HashMap;

/**
 *
 * @author adb
 */
public class Solution303{

  private int[] sum;

  public Solution303(int[] nums){
    int currSum = 0;
    sum = new int[nums.length];

    for(int ix = 0; ix < nums.length; ix++){
      currSum += nums[ix];
      sum[ix] = currSum;
    }
  }

  public int sumRange(int i, int j){
    return sum[j] - ((i > 0) ? sum[i - 1] : 0);
  }
}

/**
 * Your NumArray object will be instantiated and called as such: NumArray obj = new NumArray(nums); int param_1 =
 * obj.sumRange(i,j);
 */
