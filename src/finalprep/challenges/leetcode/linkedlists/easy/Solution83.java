package finalprep.challenges.leetcode.linkedlists.easy;

import finalprep.challenges.leetcode.commons.ListNode;

/**
 *
 * @author adb
 */
public class Solution83{

  public ListNode deleteDuplicates(ListNode head){
    ListNode prevNode = null;

    if(head == null){
      return null;
    }

    prevNode = head;

    while(prevNode.next != null){
      if(prevNode.next.val == prevNode.val){
        prevNode.next = prevNode.next.next;
      }else{
        prevNode = prevNode.next;
      }
    }

    return head;
  }
}
