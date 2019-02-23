package finalprep.misc;

import finalprep.challenges.leetcode.commons.ListNode;

/**
 *
 * @author adb
 */
public class LinkedListCopy{

  public static ListNode deepCopy(ListNode head){
    ListNode cloneHead = null;
    ListNode link = null;

    while(head != null){
      if(link == null){
        link = new ListNode(head.val);
      }else{
        link.next = new ListNode(head.val);
        link = link.next;
      }

      if(cloneHead == null){
        cloneHead = link;
      }

      head = head.next;
    }

    return cloneHead;
  }
}
