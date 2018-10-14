package finalprep.challenges.leetcode.arrays.easy;

/**
 *
 * @author adb
 *
 * O(N)
 */
public class Solution268{

  public int missingNumber(int[] nums){
    int missing = nums.length;

    for(int ix = 0; ix < nums.length; ix++){
      missing ^= ix;
      missing ^= nums[ix];
    }

    return missing;
  }
}
