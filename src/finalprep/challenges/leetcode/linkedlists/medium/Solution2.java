package finalprep.challenges.leetcode.linkedlists.medium;

import finalprep.challenges.leetcode.commons.ListNode;

/**
 *
 * @author adb
 */
public class Solution2{

  public ListNode addTwoNumbers(ListNode l1, ListNode l2){
    return nextSequence(l1, l2, false);
  }

  private ListNode nextSequence(ListNode l1, ListNode l2, boolean carry){
    int newVal = 0;
    ListNode l;

    if(l1 == null && l2 == null && !carry){
      return null;
    }

    if(l1 != null){
      newVal += l1.val;
    }

    if(l2 != null){
      newVal += l2.val;
    }

    if(carry){
      newVal++;
    }

    carry = newVal > 9;
    newVal = newVal % 10;

    l = new ListNode(newVal);
    l.next = nextSequence(l1 != null ? l1.next : null, l2 != null ? l2.next : null, carry);

    return l;
  }
}
