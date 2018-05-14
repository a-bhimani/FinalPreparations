package finalprep.challenges.leetcode.easy.tests;

import finalprep.challenges.leetcode.commons.ListNode;
import finalprep.challenges.leetcode.easy.Solution160;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author adb
 */
public class Test160{

  @Test
  public void run(){
    ListNode n1 = new ListNode(1);
    ListNode n2 = new ListNode(3);
    ListNode n3 = new ListNode(5);
    ListNode n4 = new ListNode(7);
    ListNode n5 = new ListNode(9);
    ListNode n6 = new ListNode(11);
    n1.next = n2;
    n2.next = n3;
    n3.next = n4;
    n4.next = n5;
    n5.next = n6;

    ListNode l1 = new ListNode(2);
    ListNode l2 = new ListNode(4);
    ListNode l3 = new ListNode(9);
    ListNode l4 = new ListNode(11);
    l1.next = l2;
    l2.next = l3;
    l3.next = l4;

    assertEquals(new Solution160().getIntersectionNode(n1, l1).val, 9);
  }
}
