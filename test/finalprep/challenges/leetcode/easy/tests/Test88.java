package finalprep.challenges.leetcode.easy.tests;

import finalprep.challenges.leetcode.easy.Solution88;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author adb
 */
public class Test88{

  @Test
  public void run(){
    Solution88 sol = new Solution88();
    int[] ar;

    ar = new int[]{1, 2, 3, 0, 0, 0};
    sol.merge(ar, 3, new int[]{2, 5, 6}, 3);
    assertArrayEquals(ar, new int[]{1, 2, 2, 3, 5, 6});

    ar = new int[]{-1, 2, 3, 0, 0, 0};
    sol.merge(ar, 3, new int[]{-2, 5, 6}, 3);
    assertArrayEquals(ar, new int[]{-2, -1, 2, 3, 5, 6});

    ar = new int[]{0};
    sol.merge(ar, 0, new int[]{1}, 1);
    assertArrayEquals(ar, new int[]{1});

    ar = new int[]{-2, 0, 0, 0};
    sol.merge(ar, 1, new int[]{-3, -2, -1}, 3);
    assertArrayEquals(ar, new int[]{-3, -2, -2, -1});
  }
}
