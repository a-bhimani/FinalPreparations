package finalprep.challenges.leetcode.arrays.easy;

import finalprep.sorting.Sorter;

/**
 *
 * @author adb
 */
public class Solution189{

  public void rotate(int[] nums, int k){
    int jy = nums.length - k;
    int[] ksub = new int[jy > 0 ? jy : k];

    for(int ix = 0, kz = 0; ix < nums.length; ix++){
      if(ix < ksub.length){
        ksub[ix] = nums[ix];
      }

      if(ix < k){
        if(jy < 0 || jy >= nums.length){
          jy = 0;
        }

        nums[ix] = nums[jy];
        jy++;
      }else{
        if(kz < 0 || kz >= ksub.length){
          kz = 0;
        }

        nums[ix] = ksub[kz];
        kz++;
      }
    }
  }
}
