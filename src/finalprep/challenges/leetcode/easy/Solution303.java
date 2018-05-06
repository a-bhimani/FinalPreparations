package finalprep.challenges.leetcode.easy;

import java.util.HashMap;

/**
 *
 * @author adb
 */
public class Solution303{

  private HashMap<Integer, Integer> mp = new HashMap<>();

  public Solution303(int[] nums){
    for(int ix = 0; ix < nums.length; ix++){
      int sum = 0;

      for(int jy = ix; jy < nums.length; jy++){
        sum += nums[jy];
        mp.put((Integer.toString(ix) + "," + Integer.toString(jy)).hashCode(), sum);
      }
    }
  }

  public int sumRange(int i, int j){
    return this.mp.getOrDefault((Integer.toString(i) + "," + Integer.toString(j)).hashCode(), 0);
  }
}

/**
 * Your NumArray object will be instantiated and called as such: NumArray obj = new NumArray(nums); int param_1 =
 * obj.sumRange(i,j);
 */
