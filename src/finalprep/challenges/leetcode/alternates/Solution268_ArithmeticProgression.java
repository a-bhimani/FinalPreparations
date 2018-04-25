package finalprep.challenges.leetcode.alternates;

import finalprep.challenges.leetcode.easy.*;

/**
 *
 * @author adb
 *
 * O(N)
 */
public class Solution268_ArithmeticProgression{

  public int missingNumber(int[] nums){
    int sum = 0;

    for(int ix = 0; ix < nums.length; ix++){
      sum += nums[ix];
    }

    return ((nums.length * (nums.length + 1)) / 2) - sum;
  }
}
