package finalprep.challenges.leetcode.arrays.easy;

/**
 *
 * @author adb
 */
public class Solution283{

  public int[] moveZeroes(int[] nums){
    for(int ix = 0, jy = 0; ix < nums.length; ix++){
      int z = nums[ix];
      nums[ix] = nums[jy];
      nums[jy] = z;

      if(z != 0){
        jy++;
      }
    }

    return nums;
  }
}
