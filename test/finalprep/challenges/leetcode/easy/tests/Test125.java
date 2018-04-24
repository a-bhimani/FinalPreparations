package finalprep.challenges.leetcode.easy.tests;

import finalprep.challenges.leetcode.easy.Solution125;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author adb
 */
public class Test125{

  @Test
  public void run(){
    Solution125 sol = new Solution125();
    assertTrue(sol.isPalindrome("A man, a plan, a canal: Panama"));
    assertFalse(sol.isPalindrome("0F"));
    assertTrue(sol.isPalindrome("MALAYALAM"));
    assertTrue(sol.isPalindrome(""));
    assertTrue(sol.isPalindrome("0"));
    assertFalse(sol.isPalindrome("01"));
  }

}
