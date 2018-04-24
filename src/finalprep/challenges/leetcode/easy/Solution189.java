package finalprep.challenges.leetcode.easy;

import finalprep.sorting.Sorter;

/**
 *
 * @author adb
 */
public class Solution189{

  public void rotate(int[] nums, int k){
    int[] ksub = new int[k];
    int jy = k;

    for(int ix = 0, kz = 0; ix < nums.length; ix++){
      if(ix < k){
        jy = (jy == nums.length - 1) ? 0 : jy + 1;
        ksub[ix] = nums[ix];
        nums[ix] = nums[jy];
      }else{
        //nums[ix] = ksub[kz];
        //kz++;
      }
    }

    Sorter.PrintArray("", ksub);
  }
}
