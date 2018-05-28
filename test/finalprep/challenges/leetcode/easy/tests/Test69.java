package finalprep.challenges.leetcode.easy.tests;

import finalprep.challenges.leetcode.easy.Solution69;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author adb
 */
public class Test69{

  @Test
  public void run(){
    Solution69 sol = new Solution69();
    assertEquals(sol.mySqrt(1), 1);
    assertEquals(sol.mySqrt(81), 9);
    assertEquals(sol.mySqrt(88), 9);
    assertEquals(sol.mySqrt(2147395600), 46340);
  }

}
