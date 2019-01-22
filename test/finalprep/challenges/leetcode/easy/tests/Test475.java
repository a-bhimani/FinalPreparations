package finalprep.challenges.leetcode.easy.tests;

import org.junit.Test;
import static org.junit.Assert.*;
import finalprep.challenges.leetcode.arrays.easy.Solution475;

/**
 *
 * @author adb
 */
public class Test475{

  @Test
  public void run(){
    Solution475 sol = new Solution475();

    assertEquals(sol.findRadius(new int[]{1, 2, 3, 4, 5, 6, 7}, new int[]{2}), 5);
    assertEquals(sol.findRadius(new int[]{1, 2, 3, 4, 5, 6, 7}, new int[]{2, 6}), 2);
    assertEquals(sol.findRadius(new int[]{1, 2, 3}, new int[]{2}), 1);
    assertEquals(sol.findRadius(new int[]{1, 2, 3, 4}, new int[]{1, 4}), 1);
    assertEquals(sol.findRadius(new int[]{1, 5}, new int[]{2}), 3);
    assertEquals(sol.findRadius(new int[]{1, 5}, new int[]{10}), 9);
  }

}
