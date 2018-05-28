package finalprep.challenges.leetcode.easy;

/**
 *
 * @author adb
 *
 * O(N), also known as Kadanes algo
 */
public class Solution53{

  public int maxSubArray(int[] nums){
    int max = 0;
    int inMax = 0;

    if(nums.length == 0){
      return 0;
    }

    max = nums[0];
    inMax = nums[0];

    for(int ix = 1; ix < nums.length; ix++){
      inMax = Math.max(inMax + nums[ix], nums[ix]);
      max = Math.max(max, inMax);
    }

    return max;
  }
}
