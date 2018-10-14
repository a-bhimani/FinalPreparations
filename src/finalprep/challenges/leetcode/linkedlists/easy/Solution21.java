package finalprep.challenges.leetcode.linkedlists.easy;

import finalprep.challenges.leetcode.commons.ListNode;

/**
 *
 * @author adb
 */
public class Solution21{

  public ListNode mergeTwoLists(ListNode l1, ListNode l2){
    ListNode mergeHead;

    if(l1 == null){
      return l2;
    }

    if(l2 == null){
      return l1;
    }

    if(l1.val < l2.val){
      mergeHead = new ListNode(l1.val);
      mergeHead.next = mergeTwoLists(l1.next, l2);
    }else{
      mergeHead = new ListNode(l2.val);
      mergeHead.next = mergeTwoLists(l1, l2.next);
    }

    return mergeHead;
  }
}
