package finalprep.challenges.leetcode.linkedlists.medium;

import finalprep.challenges.leetcode.commons.ListNode;

/**
 *
 * @author adb
 */
public class Solution2{

  public ListNode addTwoNumbers(ListNode l1, ListNode l2){
    byte toCarry = 0;
    ListNode head = null;
    ListNode prevLink = null;

    while(l1 != null || l2 != null || toCarry == 1){
      int currVal = ((l1 != null) ? l1.val : 0) + ((l2 != null) ? l2.val : 0) + toCarry;
      ListNode currLink;

      toCarry = 0;
      if(currVal >= 10){
        currVal = currVal % 10;
        toCarry = 1;
      }

      currLink = new ListNode(currVal);
      if(head == null){
        head = currLink;
      }

      if(prevLink != null){
        prevLink.next = currLink;
      }

      prevLink = currLink;

      if(l1 != null){
        l1 = l1.next;
      }

      if(l2 != null){
        l2 = l2.next;
      }
    }

    return head;
  }
}
