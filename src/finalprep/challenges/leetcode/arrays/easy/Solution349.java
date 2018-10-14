package finalprep.challenges.leetcode.arrays.easy;

import java.util.Arrays;
import java.util.HashSet;

/**
 *
 * @author adb
 */
public class Solution349{

  public int[] continuous_intersection(int[] nums1, int[] nums2){
    int ix = 0;
    int[] result;
    HashSet<Integer> set = new HashSet<>();
    HashSet<Integer> currSet = new HashSet<>();

    for(ix = 0; ix < nums1.length; ix++){
      int jy = 0;

      currSet.clear();

      if(nums2.length > 0 && nums1[ix] == nums2[jy]){
        int kz = ix + 1;
        boolean b = true;

        currSet.add(nums1[ix]);

        for(jy = 1; jy < nums2.length && kz < nums1.length; jy++, kz++){
          if(nums2[jy] != nums1[kz]){
            b = false;
            break;
          }

          currSet.add(nums1[kz]);
        }

        if(currSet.size() > set.size()){
          set = (HashSet)currSet.clone();
        }

        if(b){
          break;
        }
      }
    }

    ix = 0;
    result = new int[set.size()];
    for(Integer e : set){
      result[ix] = e;
      ix++;
    }

    return result;
  }

  public int[] intersection(int[] nums1, int[] nums2){
    int jy;
    int[] result;
    HashSet<Integer> set1 = new HashSet<>();
    HashSet<Integer> set2 = new HashSet<>();

    for(int ix : nums1){
      set1.add(ix);
    }

    for(int ix : nums2){
      if(set1.contains(ix)){
        set2.add(ix);
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
