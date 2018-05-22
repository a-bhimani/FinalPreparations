package finalprep.challenges.leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author adb
 */
public class Solution15{

  public List<List<Integer>> threeSum(int[] nums){
    List<List<Integer>> lstSums = new ArrayList<>();
    Set<List<Integer>> uniqueSet = new HashSet<>();

    for(int ix = 0; ix < nums.length - 2; ix++){
      for(int jy = ix + 1; jy < nums.length - 1; jy++){
        for(int kz = jy + 1; kz < nums.length; kz++){
          if((nums[ix] + nums[jy] + nums[kz]) == 0){
            List<Integer> lstNums = Arrays.asList(new Integer[]{nums[ix], nums[jy], nums[kz]});
            lstNums.sort(Comparator.naturalOrder());

            if(!uniqueSet.contains(lstNums)){
              uniqueSet.add(lstNums);
              lstSums.add(lstNums);
            }
          }
        }
      }
    }

    return lstSums;
  }
}
