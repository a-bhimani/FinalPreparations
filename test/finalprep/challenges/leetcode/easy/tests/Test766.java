package finalprep.challenges.leetcode.easy.tests;

import finalprep.challenges.leetcode.easy.Solution766;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author adb
 */
public class Test766{

  @Test
  public void run(){
    Solution766 sol = new Solution766();
    assertTrue(sol.isToeplitzMatrix(new int[][]{
      new int[]{18},
      new int[]{66}
    }));

    assertFalse(sol.isToeplitzMatrix(new int[][]{
      new int[]{11, 74, 0, 93},
      new int[]{40, 11, 74, 7}
    }));

    assertTrue(sol.isToeplitzMatrix(new int[][]{
      new int[]{1, 2, 3, 4},
      new int[]{5, 1, 2, 3},
      new int[]{9, 5, 1, 2}
    }));

    assertFalse(sol.isToeplitzMatrix(new int[][]{
      new int[]{1, 2},
      new int[]{2, 2}
    }));

    assertFalse(sol.isToeplitzMatrix(new int[][]{
      new int[]{22, 0, 94, 45, 46, 96},
      new int[]{10, 22, 80, 94, 45, 46}
    }));
  }
}
