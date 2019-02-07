package finalprep.challenges.leetcode.easy.tests;

import finalprep.challenges.leetcode.arrays.easy.Solution581;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author adb
 */
public class Test581{

  @Test
  public void run(){
    Solution581 sol = new Solution581();
    assertEquals(sol.findUnsortedSubarray(new int[]{2, 6, 4, 8, 10, 9, 15}), 5);
    assertEquals(sol.findUnsortedSubarray(new int[]{1, 2, 3, 4}), 0);
    assertEquals(sol.findUnsortedSubarray(new int[]{1, 3, 2, 2, 2}), 4);
    assertEquals(sol.findUnsortedSubarray(new int[]{2, 3, 3, 2, 4}), 3);
    assertEquals(sol.findUnsortedSubarray(new int[]{1, 2, 4, 5, 3}), 3);
  }
}
