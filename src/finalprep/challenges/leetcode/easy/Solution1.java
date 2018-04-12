/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalprep.challenges.leetcode.easy;

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
