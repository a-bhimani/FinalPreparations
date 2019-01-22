package finalprep.challenges.leetcode.arrays.easy;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author adb
 */
public class Solution475{

  public int findRadius(int[] houses, int[] heaters){
    boolean b1 = true, b2 = true;
    int d = 0, ix = 0, jy = houses.length - 1;

    while(ix < houses.length){
      if(heaters[0] == houses[ix]){
        b1 = false;
        break;
      }

      ix++;
    }

    while(jy >= 0){
      if(heaters[heaters.length - 1] == houses[jy]){
        b2 = false;
        break;
      }

      jy--;
    }

    d = (ix - 0) > (houses.length - jy - 1) ? (ix - 0) : (houses.length - jy - 1);

    if(b1 && b2){
      return d + 1;
    }

    if(heaters.length > 1){
      int kz = 1;

      while((ix <= jy) && (kz < heaters.length)){
        int d1 = 0;

        while(ix <= jy){
          if(houses[ix] == heaters[kz]){
            break;
          }

          d1++;
          ix++;
        }

        d1 = (int)Math.ceil(d1 / 2);
        d = d1 > d ? d1 : d;
        kz++;
      }
    }

    return d;
  }
}
