package finalprep.challenges.leetcode.arrays.easy;

/**
 *
 * @author adb
 */
public class Solution581{

  public int findUnsortedSubarray(int[] nums){

    for(int ix = 0; ix < nums.length - 1; ix++){
      if(nums[ix] > nums[ix + 1]){
        while(ix > 0 && nums[ix] == nums[ix - 1]){
          ix--;
        }

        for(int jy = nums.length - 1; jy > ix; jy--){
          if(nums[jy] > nums[jy - 1] || nums[ix] > nums[jy]){
            return jy - ix + 1;
          }
        }

        return nums.length - ix;
      }
    }

    return 0;
  }
}
