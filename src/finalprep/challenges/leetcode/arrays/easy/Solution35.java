package finalprep.challenges.leetcode.arrays.easy;

/**
 *
 * @author adb
 *
 * O(N), Can you solve in O(log N)?
 */
public class Solution35{

  public int searchInsert(int[] nums, int target){
    int ix = 0;

    while(ix < nums.length){
      if(target == nums[ix]){
        return ix;
      }

      if(target < nums[ix]){
        break;
      }

      ix++;
    }

    return ix;
  }
}
