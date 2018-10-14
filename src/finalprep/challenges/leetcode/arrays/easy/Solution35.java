package finalprep.challenges.leetcode.arrays.easy;

/**
 *
 * @author adb
 *
 * O(N), Can you solve in O(log N)?
 */
public class Solution35{

  public int searchInsert(int[] nums, int target){
    int ix = nums.length - 1;

    while(ix >= 0 && target <= nums[ix]){
      --ix;
    }

    return ix + 1;
  }
}
