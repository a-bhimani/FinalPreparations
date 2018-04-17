package finalprep.challenges.leetcode.easy;

/**
 *
 * @author adb
 *
 * O(N), also known as Kadanes algo
 */
public class Solution53{

  public int maxSubArray(int[] nums){
    int max = nums.length == 0 ? 0 : nums[0];
    int inMax = max;

    for(int ix = 1; ix < nums.length; ix++){
      if((nums[ix] + inMax) > nums[ix]){
        inMax += nums[ix];
      }else{
        inMax = nums[ix];
      }

      if(inMax > max){
        max = inMax;
      }
    }

    return max;
  }
}
