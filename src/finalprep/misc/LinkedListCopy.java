package finalprep.misc;

import finalprep.challenges.leetcode.commons.ListNode;

/**
 *
 * @author adb
 */
public class LinkedListCopy{

  public static ListNode deepCopy(ListNode head){
    ListNode cloneHead = null;
    ListNode prevCur = null;

    while(head != null){
      ListNode link = new ListNode(head.val);

      if(prevCur != null){
        prevCur.next = link;
      }

      if(cloneHead == null){
        cloneHead = link;
      }

      prevCur = link;
      head = head.next;
    }

    return cloneHead;
  }
}
