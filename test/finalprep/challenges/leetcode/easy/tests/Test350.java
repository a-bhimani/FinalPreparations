package finalprep.challenges.leetcode.easy.tests;

import finalprep.challenges.leetcode.arrays.easy.Solution350;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author adb
 */
public class Test350{

  @Test
  public void run(){
    Solution350 sol = new Solution350();
    assertArrayEquals(sol.intersect(new int[]{1, 1}, new int[]{1}), new int[]{1});
    assertArrayEquals(sol.intersect(new int[]{1, 2, 2, 3}, new int[]{2, 2}), new int[]{2, 2});
  }

}
