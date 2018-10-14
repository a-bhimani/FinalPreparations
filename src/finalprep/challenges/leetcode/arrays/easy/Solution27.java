package finalprep.challenges.leetcode.arrays.easy;

/**
 *
 * @author adb
 */
public class Solution27{

  public int removeElement(int[] nums, int val){
    int ix = 0;

    for(int jy = 0; jy < nums.length; jy++){
      if(val != nums[jy]){
        nums[ix] = nums[jy];
        ix++;
      }
    }

    return ix;
  }
}
