package finalprep.challenges.leetcode.arrays.easy;

/**
 *
 * @author adb
 */
public class Solution198{

  public int rob(int[] nums){
    int[] sum;

    if(nums.length == 0){
      return 0;
    }

    sum = new int[nums.length];

    if(nums.length >= 1){
      sum[0] = nums[0];

      if(nums.length >= 2){
        sum[1] = Math.max(nums[0], nums[1]);
      }

      for(int ix = 2; ix < nums.length; ix++){
        sum[ix] = Math.max(sum[ix - 1], sum[ix - 2] + nums[ix]);
      }
    }

    return sum[sum.length - 1];
  }
}
