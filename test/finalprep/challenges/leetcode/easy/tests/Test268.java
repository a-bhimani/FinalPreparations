package finalprep.challenges.leetcode.easy.tests;

import finalprep.challenges.leetcode.arrays.easy.Solution268;
import finalprep.challenges.leetcode.alternates.Solution268_ArithmeticProgression;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author adb
 */
public class Test268{

  @Test
  public void run(){
    Solution268_ArithmeticProgression sol = new Solution268_ArithmeticProgression();
    assertEquals(sol.missingNumber(new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1}), 8);
    assertEquals(sol.missingNumber(new int[]{3, 0, 1}), 2);
    assertEquals(sol.missingNumber(new int[]{1, 2, 3, 4, 0, 6}), 5);
  }

}
