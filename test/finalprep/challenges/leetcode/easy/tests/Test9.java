package finalprep.challenges.leetcode.easy.tests;

import finalprep.challenges.leetcode.mathematical.easy.Solution9;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author adb
 */
public class Test9{

  @Test
  public void run(){
    assertTrue(new Solution9().isPalindrome(12121));
    assertFalse(new Solution9().isPalindrome(3213258));
    assertTrue(new Solution9().isPalindrome(99999999));
    assertTrue(new Solution9().isPalindrome(999999999));
  }
}
