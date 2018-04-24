package finalprep.challenges.leetcode.easy;

/**
 *
 * @author adb
 */
public class Solution189{

  public void rotate(int[] nums, int k){
    int[] ksub = new int[k];
    int jy = k + 1;

    for(int ix = 0; ix < nums.length; ix++){

      if(ix < k){
        ksub[ix] = nums[ix];
        nums[ix] = nums[ix + k + 1];
      }
    }
  }
}
