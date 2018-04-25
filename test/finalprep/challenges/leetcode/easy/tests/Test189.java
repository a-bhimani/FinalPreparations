package finalprep.challenges.leetcode.easy.tests;

import finalprep.challenges.leetcode.easy.Solution189;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author adb
 */
public class Test189{

  @Test
  public void run(){
    int[] nums;
    Solution189 sol = new Solution189();

    nums = new int[]{1, 2, 3, 4, 5, 6, 7};
    sol.rotate(nums, 3);
    assertArrayEquals(nums, new int[]{5, 6, 7, 1, 2, 3, 4});

    nums = new int[]{-1};
    sol.rotate(nums, 2);
    assertArrayEquals(nums, new int[]{-1});

    nums = new int[]{1, 2};
    sol.rotate(nums, 3);
    assertArrayEquals(nums, new int[]{2, 1});
  }

}
