package finalprep.challenges.leetcode.arrays.easy;

import java.util.Arrays;

/**
 *
 * @author adb
 */
public class Solution665{

  public boolean checkPossibility(int[] nums){
    int jy = 0, kz = 0;
    int[] numsClone;

    if(nums.length <= 1){
      return true;
    }

    numsClone = Arrays.copyOf(nums, nums.length);

    for(int ix = 1, la = nums.length - 2; ix < numsClone.length; ix++, la--){
      if(numsClone[ix] < numsClone[ix - 1]){
        numsClone[ix] = numsClone[ix - 1];
        jy++;
      }

      if(nums[la + 1] < nums[la]){
        nums[la] = nums[la + 1];
        kz++;
      }
    }

    return (jy <= 1) || kz == 1;
  }
}
