package finalprep.challenges.leetcode.alternates;

import java.util.HashMap;

/**
 *
 * @author adb
 */
public class Solution303_map{

  private HashMap<Integer, Integer> mp = new HashMap<>();

  public Solution303_map(int[] nums){
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
