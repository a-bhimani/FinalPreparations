package finalprep.misc;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author adb
 */
public class ArrayUnion{

  public List<Integer> union(int[] nums1, int[] nums2){
    List<Integer> result = new ArrayList<>();

    for(int ix = 0; ix < nums1.length; ix++){
      result.add(nums1[ix]);
    }

    for(int ix = 0, jy = 0; ix < nums2.length; ix++){
      int x = nums2[ix];

      for(; jy < result.size(); jy++){
        if(result.get(jy) >= x){
          break;
        }
      }

      result.add(jy, x);
    }

    return result;
  }

  public List<Integer> union_distinct(int[] nums1, int[] nums2){
    List<Integer> result = new ArrayList<>();
    Set<Integer> uniqueSet = new HashSet<>();

    for(int ix = 0; ix < nums1.length; ix++){
      if(!uniqueSet.contains(nums1[ix])){
        uniqueSet.add(nums1[ix]);
        result.add(nums1[ix]);
      }
    }

    for(int ix = 0, jy = 0; ix < nums2.length; ix++){
      int x = nums2[ix];

      for(; jy < result.size(); jy++){
        if(result.get(jy) >= x){
          break;
        }
      }

      if(!uniqueSet.contains(x)){
        result.add(jy, x);
      }
    }

    return result;
  }
}
