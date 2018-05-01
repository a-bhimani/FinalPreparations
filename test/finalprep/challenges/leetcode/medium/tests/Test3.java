package finalprep.challenges.leetcode.medium.tests;

import finalprep.challenges.leetcode.medium.Solution3;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author adb
 */
public class Test3{

  @Test
  public void run(){
    Solution3 sol = new Solution3();
    assertEquals(sol.lengthOfLongestSubstring("abcabcbb"), 3);
    assertEquals(sol.lengthOfLongestSubstring("bbbbb"), 1);
    assertEquals(sol.lengthOfLongestSubstring("pwwkew"), 3);
    assertEquals(sol.lengthOfLongestSubstring("dvdf"), 3);
  }

}
