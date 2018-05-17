package finalprep.challenges.leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author adb
 */
public class Solution830{

  public List<List<Integer>> largeGroupPositions(String S){
    List<List<Integer>> toReturn = new ArrayList<List<Integer>>();

    for(int ix = 0; ix < S.length(); ix++){
      int ch = S.charAt(ix);
      int count = 1;

      ix++;
      while(ix < S.length() && ch == S.charAt(ix)){
        ix++;
        count++;
      }

      ix--;
      if(count >= 3){
        toReturn.add(Arrays.asList(new Integer[]{ix - count + 1, ix}));
      }

    }

    return toReturn;
  }
}
