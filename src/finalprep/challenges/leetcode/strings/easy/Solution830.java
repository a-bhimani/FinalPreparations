package finalprep.challenges.leetcode.strings.easy;

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
      int jy = ix;
      Character ch = S.charAt(ix);
      int count = 0;

      while(jy < S.length() && ch.equals(S.charAt(jy))){
        jy++;
        count++;
      }

      if(count >= 3){
        toReturn.add(Arrays.asList(new Integer[]{ix, jy - 1}));
        ix = jy - 1;
      }

    }

    return toReturn;
  }
}
