package finalprep.challenges.leetcode.easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 *
 * @author adb
 */
public class Solution350{

  public int[] intersect(int[] nums1, int[] nums2){
    int jy;
    int[] result;
    List<Integer> set1 = new ArrayList<>();
    List<Integer> set2 = new ArrayList<>();

    for(int ix : nums1){
      set1.add(ix);
    }

    for(int ix : nums2){
      if(set1.contains(ix)){
        set2.add(ix);
        set1.remove(set1.indexOf(ix));
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
