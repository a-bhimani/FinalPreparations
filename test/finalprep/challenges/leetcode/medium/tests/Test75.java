package finalprep.challenges.leetcode.medium.tests;

import finalprep.challenges.leetcode.arrays.medium.Solution75;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author adb
 */
public class Test75{

  @Test
  public void run(){
    Solution75 sol = new Solution75();
    int[] nums;

    nums = new int[]{1, 2, 0};
    sol.sortColors(nums);
    assertArrayEquals(nums, new int[]{0, 1, 2});
  }

}
