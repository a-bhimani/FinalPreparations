package finalprep.challenges.leetcode.arrays.easy;

/**
 *
 * @author adb
 */
public class Solution1{

  public int[] twoSum(int[] nums, int target){
    for(int ix = 0; ix < nums.length; ix++){
      for(int jy = ix + 1; jy < nums.length; jy++){
        if(nums[ix] + nums[jy] == target){
          return new int[]{ix, jy};
        }
      }
    }
    return null;
  }
}
