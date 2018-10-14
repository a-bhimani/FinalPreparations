package finalprep.challenges.leetcode.medium.tests;

import finalprep.challenges.leetcode.strings.medium.Solution8;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author adb
 */
public class Test8{

  @Test
  public void run(){
    Solution8 sol = new Solution8();
    assertEquals(sol.myAtoi("+1"), 1);
    assertEquals(sol.myAtoi("4 1"), 4);
    assertEquals(sol.myAtoi("asd-4"), 0);
    assertEquals(sol.myAtoi("words and 987"), 0);
    assertEquals(sol.myAtoi("4193 with words"), 4193);
    assertEquals(sol.myAtoi("-91283472332"), -2147483648);
    assertEquals(sol.myAtoi("-   42"), 0);
    assertEquals(sol.myAtoi("-   234"), 0);
    assertEquals(sol.myAtoi("   -42"), -42);
    assertEquals(sol.myAtoi("+-2"), 0);
    assertEquals(sol.myAtoi("9223372036854775808"), 2147483647);
  }

}
