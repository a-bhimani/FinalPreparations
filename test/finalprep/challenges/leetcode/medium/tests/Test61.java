package finalprep.challenges.leetcode.medium.tests;

import finalprep.challenges.leetcode.commons.ListNode;
import finalprep.challenges.leetcode.linkedlists.medium.Solution61;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author adb
 */
public class Test61{

  @Test
  public void run(){
    Solution61 sol = new Solution61();
    assertEquals(sol.rotateRight(new ListNode(new int[]{1, 2, 3, 4, 5}), 2), new ListNode(new int[]{4, 5, 1, 2, 3}));
    assertEquals(sol.rotateRight(new ListNode(new int[]{1, 2, 3, 4, 5}), 5), new ListNode(new int[]{1, 2, 3, 4, 5}));
    assertEquals(sol.rotateRight(new ListNode(new int[]{1, 2, 3, 4, 5}), 10), new ListNode(new int[]{1, 2, 3, 4, 5}));
    assertEquals(sol.rotateRight(new ListNode(new int[]{1, 2}), 0), new ListNode(new int[]{1, 2}));
    assertEquals(sol.rotateRight(new ListNode(new int[]{1, 2}), 2), new ListNode(new int[]{1, 2}));
  }
}
