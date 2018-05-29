package finalprep.challenges.leetcode.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author adb
 */
public class Solution350{

  public int[] intersect(int[] nums1, int[] nums2){
    int jy;
    int[] result;
    Map<Integer, Integer> set1 = new HashMap<>();
    List<Integer> set2 = new ArrayList<>();

    for(int ix : nums1){
      set1.put(ix, set1.getOrDefault(ix, 0) + 1);
    }

    for(int ix : nums2){
      int ct = set1.getOrDefault(ix, 0);

      if(ct >= 1){
        set2.add(ix);
        set1.put(ix, ct - 1);
      }
    }

    jy = 0;
    result = new int[set2.size()];
    for(Integer e : set2){
      result[jy] = e;
      jy++;
    }

    return result;
  }
}
