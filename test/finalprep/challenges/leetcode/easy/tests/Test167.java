package finalprep.challenges.leetcode.easy.tests;

import finalprep.challenges.leetcode.easy.Solution167;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author adb
 */
public class Test167{

  @Test
  public void run(){
    Solution167 sol = new Solution167();
    assertArrayEquals(sol.twoSum(new int[]{2, 7, 11, 15}, 9), new int[]{1, 2});
    assertArrayEquals(sol.twoSum(new int[]{2, 7, 11, 15}, 13), new int[]{1, 3});
    assertArrayEquals(sol.twoSum(new int[]{5, 25, 75}, 100), new int[]{2, 3});
    assertArrayEquals(sol.twoSum(new int[]{3, 24, 50, 79, 88, 150, 345}, 200), new int[]{3, 6});
    assertArrayEquals(sol.twoSum(new int[]{3, 24, 50, 79, 88, 150, 345}, 200), new int[]{3, 6});
  }

}
