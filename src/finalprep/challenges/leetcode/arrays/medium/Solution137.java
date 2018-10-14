package finalprep.challenges.leetcode.arrays.medium;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author adb
 */
public class Solution137{

  public int singleNumber(int[] nums){
    Map<Integer, Boolean> mapNums = new HashMap<>();
    Set<Integer> uniques = new HashSet<>();

    for(int ix = 0; ix < nums.length; ix++){
      if(mapNums.containsKey(nums[ix])){
        boolean b = mapNums.get(nums[ix]);

        if(!b){
          uniques.remove(nums[ix]);
        }

        mapNums.put(nums[ix], true);
      }else{
        mapNums.put(nums[ix], false);
        uniques.add(nums[ix]);
      }
    }

    return (int)uniques.toArray()[0];
  }
}
