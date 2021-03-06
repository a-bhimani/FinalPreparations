package finalprep.challenges.leetcode.easy.tests;

import org.junit.Test;
import static org.junit.Assert.*;
import finalprep.challenges.leetcode.arrays.easy.Solution35;

/**
 *
 * @author adb
 */
public class Test35{

  @Test
  public void run(){
    Solution35 sol = new Solution35();
    assertEquals(sol.searchInsert(new int[]{1, 3, 5, 6}, 0), 0);
    assertEquals(sol.searchInsert(new int[]{1, 3, 5, 7}, 6), 3);
    assertEquals(sol.searchInsert(new int[]{1, 3, 5, 6}, 2), 2);
  }
}
