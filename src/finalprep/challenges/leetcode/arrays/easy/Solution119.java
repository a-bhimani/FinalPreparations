package finalprep.challenges.leetcode.arrays.easy;

import finalprep.challenges.leetcode.arrays.easy.Solution118;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author adb
 */
public class Solution119{

  public List<Integer> getRow(int rowIndex){
    return new Solution118().generate(rowIndex + 1).get(rowIndex);
  }
}
