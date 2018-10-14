package finalprep.challenges.leetcode.arrays.easy;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author adb
 */
public class Solution204{

  public int countPrimes(int n){
    Set<Integer> primeSet = new HashSet<>();

    for(int ix = 2; ix < n; ix++){
      primeSet.add(ix);
    }

    for(int ix = 2; (ix * ix) < n; ix++){
      if(primeSet.contains(ix)){
        for(int jy = (ix * ix); jy < n; jy += ix){
          primeSet.remove(jy);
        }
      }
    }

    return primeSet.size();
  }
}
