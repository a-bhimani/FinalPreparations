package finalprep.challenges.leetcode.linkedlists.medium;

import finalprep.challenges.leetcode.commons.ListNode;

/**
 *
 * @author adb
 */
public class Solution24{

  public ListNode swapPairs(ListNode head){
    ListNode currNode = null;

    if(head == null){
      return null;
    }

    if(head.next == null){
      currNode = new ListNode(head.val);
      currNode.next = null;
    }else{
      currNode = new ListNode(head.next.val);
      currNode.next = new ListNode(head.val);
      currNode.next.next = swapPairs(head.next.next);
    }

    return currNode;
  }
}
