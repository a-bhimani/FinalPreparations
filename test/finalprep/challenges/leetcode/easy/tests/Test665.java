package finalprep.challenges.leetcode.easy.tests;

import finalprep.challenges.leetcode.arrays.easy.Solution665;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author adb
 */
public class Test665{

  @Test
  public void run(){
    assertTrue(new Solution665().checkPossibility(new int[]{4, 2, 3}));
    assertFalse(new Solution665().checkPossibility(new int[]{4, 2, 1}));
    assertFalse(new Solution665().checkPossibility(new int[]{3, 4, 2, 3}));
    assertFalse(new Solution665().checkPossibility(new int[]{3, 3, 2, 2}));
    assertTrue(new Solution665().checkPossibility(new int[]{1, 1, 1}));
    assertFalse(new Solution665().checkPossibility(new int[]{1}));
    assertFalse(new Solution665().checkPossibility(new int[]{1, 3, 5, 2, 4}));
  }
}
