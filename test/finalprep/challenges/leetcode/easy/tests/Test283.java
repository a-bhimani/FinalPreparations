package finalprep.challenges.leetcode.easy.tests;

import finalprep.challenges.leetcode.easy.Solution283;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author adb
 */
public class Test283{

  @Test
  public void run(){
    Solution283 sol = new Solution283();
    assertArrayEquals(sol.moveZeroes(new int[]{2, 4, 0, 8, 0, 0, 0}), new int[]{2, 4, 8, 0, 0, 0, 0});
    assertArrayEquals(sol.moveZeroes(new int[]{0, 1, 0, 3, 12}), new int[]{1, 3, 12, 0, 0});
  }

}
