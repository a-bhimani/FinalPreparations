package finalprep.challenges.leetcode.arrays.easy;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author adb
 */
public class Solution118{

  public List<List<Integer>> generate(int numRows){
    List<List<Integer>> lstPtr = new ArrayList<>();

    for(int ix = 1; ix <= numRows; ix++){
      List<Integer> lstNums = new ArrayList<>();

      for(int jy = 0; jy < ix; jy++){
        if((jy == 0) || (jy == (ix - 1))){
          lstNums.add(1);
        }else{
          List<Integer> lstLast = lstPtr.get(lstPtr.size() - 1);
          lstNums.add(lstLast.get(jy - 1) + lstLast.get(jy));
        }
      }

      lstPtr.add(lstNums);
    }

    return lstPtr;
  }
}
