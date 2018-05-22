package finalprep.challenges.leetcode.medium.tests;

import finalprep.challenges.leetcode.medium.Solution50;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author adb
 */
public class Test50{

  @Test
  public void run(){
    Solution50 sol = new Solution50();
    assertEquals(sol.myPow(2.00000, 10), 1024.00000);
    assertEquals(sol.myPow(2.00000, -2), 0.25000);
    assertEquals(sol.myPow(2.10000, 3), 9.261);
  }

}
