package finalprep.challenges.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author adb
 */
public class Solution169{

  public int majorityElement(int[] nums){
    Map<Integer, Integer> cv = new HashMap<>();

    for(int ix = 0; ix < nums.length; ix++){
      Integer count = cv.getOrDefault(nums[ix], 0);

      count++;
      if(count > nums.length / 2){
        return nums[ix];
      }

      cv.remove(nums[ix]);
      cv.put(nums[ix], count);
    }

    return 0;
  }
}
