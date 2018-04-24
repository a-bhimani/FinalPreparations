package finalprep.challenges.leetcode.easy.tests;

import org.junit.Test;
import static org.junit.Assert.*;
import finalprep.challenges.leetcode.easy.Solution155;

/**
 *
 * @author adb
 */
public class Test155{

  @Test
  public void run(){
    Solution155 minStack = new Solution155();

    minStack.push(-2);
    minStack.push(-0);
    minStack.push(-3);
    assertEquals(minStack.getMin(), -3);
    minStack.pop();
    assertEquals(minStack.top(), 0);
    assertEquals(minStack.getMin(), -2);
  }

}
