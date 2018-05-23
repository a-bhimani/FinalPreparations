package finalprep.challenges.leetcode.medium.tests;

import finalprep.challenges.leetcode.medium.Solution29;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author adb
 */
public class Test29{

  @Test
  public void run(){
    Solution29 sol = new Solution29();
    assertEquals(sol.divide(10, 3), 3);
    assertEquals(sol.divide(7, -3), -2);
    assertEquals(sol.divide(-2147483648, -1), 2147483647);
    assertEquals(sol.divide(2147483647, 1), 2147483647);
    assertEquals(sol.divide(-1, 1), -1);
    assertEquals(sol.divide(-1, -1), 1);
    assertEquals(sol.divide(0, 1), 0);
    assertEquals(sol.divide(-2147483648, 1), -2147483648);
    assertEquals(sol.divide(2147483647, 2), 1073741823); //Time limit exceeds
  }

}
