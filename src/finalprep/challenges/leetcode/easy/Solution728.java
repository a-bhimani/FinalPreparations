package finalprep.challenges.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author adb
 *
 * Time: O(N logR)
 */
public class Solution728{

  public List<Integer> selfDividingNumbers(int left, int right){
    List<Integer> lstNums = new ArrayList<>();

    for(int ix = left; ix <= right; ix++){
      boolean b = true;
      int num = ix;

      while(num != 0){
        int rem = num % 10;

        if(rem == 0 || ix % rem > 0){
          b = false;
          break;
        }
        num = num / 10;
      }

      if(b){
        lstNums.add(ix);
      }
    }

    return lstNums;
  }
}
