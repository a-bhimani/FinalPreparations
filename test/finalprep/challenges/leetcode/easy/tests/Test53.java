package finalprep.challenges.leetcode.easy.tests;

import finalprep.challenges.leetcode.arrays.easy.Solution53;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author adb
 */
public class Test53{

  @Test
  public void run(){
    assertEquals(new Solution53().maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}), 6);
  }

}
