package finalprep.challenges.leetcode.easy.tests;

import org.junit.Test;
import static org.junit.Assert.*;
import finalprep.challenges.leetcode.strings.easy.Solution520;

/**
 *
 * @author adb
 */
public class Test520{

  @Test
  public void run(){
    Solution520 sol = new Solution520();

    assertFalse(sol.detectCapitalUse("UsA"));
    assertTrue(sol.detectCapitalUse("USA"));
    assertTrue(sol.detectCapitalUse("Leetcode"));
  }

}
