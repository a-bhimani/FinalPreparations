package finalprep.challenges.leetcode.easy.tests;

import finalprep.challenges.leetcode.arrays.easy.Solution349;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author adb
 */
public class Test349{

  @Test
  public void run(){
    Solution349 sol = new Solution349();
    assertArrayEquals(sol.intersection(new int[]{1, 2, 2, 1}, new int[]{2, 2}), new int[]{2});
    assertArrayEquals(sol.intersection(new int[]{1, 2, 3, 4, 5}, new int[]{2, 3, 4, 5}), new int[]{2, 3, 4, 5});
    assertArrayEquals(sol.intersection(new int[]{1, 2, 3, 4, 5}, new int[]{2, 3, 4, 4}), new int[]{2, 3, 4});
    assertArrayEquals(sol.intersection(new int[]{2, 1}, new int[]{1, 2}), new int[]{2, 1});
    assertArrayEquals(sol.intersection(new int[]{3, 1, 2}, new int[]{1, 3}), new int[]{1, 3});
  }

}
