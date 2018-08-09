package finalprep.challenges.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author adb
 */
public class Solution202{

  public boolean isHappy(int n){
    Set<Integer> numSet = new HashSet<>();

    while(n > 1){
      int i = 0;

      while(n > 0){
        i += Math.pow(n % 10, 2);
        n /= 10;
      }

      if(numSet.contains(i)){
        return false;
      }

      numSet.add(i);
      n = i;
    }

    return n == 1;
  }
}
