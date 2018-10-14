package finalprep.challenges.leetcode.easy.tests;

import finalprep.challenges.leetcode.strings.easy.Solution290;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author adb
 */
public class Test290{

  @Test
  public void run(){
    Solution290 sol = new Solution290();
    assertTrue(sol.wordPattern("abba", "dog cat cat dog"));
    assertFalse(sol.wordPattern("abba", "dog cat cat fish"));
    assertFalse(sol.wordPattern("aaaa", "dog cat cat dog"));
    assertFalse(sol.wordPattern("abba", "dog dog dog dog"));
    assertFalse(sol.wordPattern("jquery", "jquery"));
  }

}
