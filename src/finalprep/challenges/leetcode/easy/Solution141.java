package finalprep.challenges.leetcode.easy;

import finalprep.challenges.leetcode.commons.ListNode;

/**
 *
 * @author adb
 */
public class Solution141{

  public boolean hasCycle(ListNode head){
    ListNode slow;
    ListNode fast;

    if(head == null || head.next == null){
      return false;
    }

    slow = head;
    fast = head.next;

    while(slow != fast){
      if(fast == null || fast.next == null){
        return false;
      }

      slow = slow.next;
      fast = fast.next.next;
    }

    return true;
  }
}
