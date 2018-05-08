package finalprep.challenges.leetcode.easy.tests;

import finalprep.challenges.leetcode.easy.Solution198;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author adb
 */
public class Test198{

  @Test
  public void run(){
    Solution198 sol = new Solution198();
    assertEquals(sol.rob(new int[]{1, 2, 3, 1}), 4);
    assertEquals(sol.rob(new int[]{2, 7, 9, 3, 1}), 12);
    assertEquals(sol.rob(new int[]{2, 1, 1, 2}), 4);
  }

}
