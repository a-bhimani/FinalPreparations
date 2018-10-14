package finalprep.challenges.leetcode.easy.tests;

import finalprep.challenges.leetcode.arrays.easy.Solution121;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author adb
 */
public class Test121{

  @Test
  public void run(){
    assertEquals(new Solution121().maxProfit(new int[]{7, 1, 5, 3, 6, 4}), 5);
    assertEquals(new Solution121().maxProfit(new int[]{2, 1, 2, 1, 0, 1, 2}), 2);
    assertEquals(new Solution121().maxProfit(new int[]{3, 3, 5, 0, 0, 3, 1, 4}), 4);
    assertEquals(new Solution121().maxProfit(new int[]{2, 1, 4}), 3);
  }
}
