package finalprep.challenges.leetcode.linkedlists.hard;

import finalprep.challenges.leetcode.commons.ListNode;

/**
 *
 * @author adb
 */
public class Solution23{

  public ListNode mergeKLists(ListNode[] lists){
    ListNode lNew = null;

    for(int ix = 0; ix < lists.length; ix++){
      lNew = mergeLists(lNew, lists[ix]);
    }

    return lNew;
  }

  private ListNode mergeLists(ListNode l1, ListNode l2){
    ListNode lMerg = null;

    if(l1 == null && l2 == null){
      return lMerg;
    }

    if(l1 == null || (l2 != null && l2.val < l1.val)){
      lMerg = new ListNode(l2.val);
      lMerg.next = mergeLists(l1, l2.next);
    }else{
      lMerg = new ListNode(l1.val);
      lMerg.next = mergeLists(l1.next, l2);
    }

    return lMerg;
  }
}
