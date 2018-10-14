package finalprep.challenges.leetcode.easy.tests;

import finalprep.challenges.leetcode.arrays.easy.Solution303;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author adb
 */
public class Test303{

  @Test
  public void run(){
    Solution303 sol = new Solution303(new int[]{-2, 0, 3, -5, 2, -1});
    assertEquals(sol.sumRange(0, 2), 1);
    assertEquals(sol.sumRange(2, 5), -1);
    assertEquals(sol.sumRange(0, 5), -3);
  }

}
