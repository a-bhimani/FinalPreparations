package finalprep.challenges.leetcode.easy;

import finalprep.challenges.leetcode.commons.ListNode;

/**
 *
 * @author adb
 */
public class Solution206{

  public ListNode reverseList(ListNode head){
    ListNode reverseHead = null;

    while(head != null){
      ListNode prevNode = reverseHead;

      reverseHead = new ListNode(head.val);
      reverseHead.next = prevNode;
      head = head.next;
    }

    return reverseHead;
  }
}
