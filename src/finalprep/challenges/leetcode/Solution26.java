package finalprep.challenges.leetcode;

/**
 *
 * @author adb
 */
public class Solution26{

  public int removeDuplicates(int[] nums){
    int jy = 0;

    if(nums.length == 0){
      return 0;
    }

    for(int ix = 1; ix < nums.length; ix++){
      if(nums[ix] != nums[jy]){
        jy++;
        nums[jy] = nums[ix];
      }
    }

    return jy + 1;
  }
}
