package finalprep.challenges.leetcode.arrays.easy;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author adb
 */
public class Solution475{

  public int findRadius(int[] houses, int[] heaters){
    int minRad = 1;
    Set<Integer> setHeaters = new HashSet<>();

    for(int ix = 0; ix < heaters.length; ix++){
      setHeaters.add(ix);
    }

    for(int ix = 0; ix < houses.length; ix++){
      int init = ix;
      int diff = 0;

      while((ix < houses.length) && !setHeaters.contains(houses[ix])){
        ix++;
      }

      diff = ix - init;

      if(init > 0 && init < (houses.length - 1)){
        diff = (int)Math.ceil(diff * .5);
      }

      minRad = Math.max(minRad, diff);
    }

    return minRad;
  }
}
