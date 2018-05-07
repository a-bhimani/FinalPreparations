package finalprep.challenges.leetcode.weekly;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author adb
 */
public class Solution830{

  public List<List<Integer>> largeGroupPositions(String S){
    List<List<Integer>> lstBounds = new ArrayList<>();

    if(S.length() > 0){

      for(int ix = 1, jy = 0, kz = 1; ix < S.length(); ix++){
        char lastCh = S.charAt(jy);
        char currCh = S.charAt(ix);

        if(lastCh == currCh){
          kz++;

          if(kz >= 3){
            if((ix == (S.length() - 1)) || currCh != S.charAt(ix + 1)){
              lstBounds.add(Arrays.asList(new Integer[]{jy, ix}));
            }
          }
        }else{
          jy = ix;
          kz = 1;
        }
      }
    }

    return lstBounds;
  }
}
