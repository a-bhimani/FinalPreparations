package finalprep.challenges.leetcode;

import finalprep.challenges.leetcode.commons.ListNode;

/**
 *
 * @author adb
 */
public class Solution2{

  public ListNode addTwoNumbers(ListNode l1, ListNode l2){
    boolean carry = false;
    ListNode toReturn = null, lnkPrevious = null;

    while(l1 != null && l2 != null){
      int sum = (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val) + (carry ? 1 : 0);

      carry = false;
      if(sum > 9){
        carry = true;
        sum -= 10;
      }

      if(toReturn == null){
        toReturn = new ListNode(sum);
        lnkPrevious = toReturn;
      }else{
        ListNode node = new ListNode(sum);
        lnkPrevious.next = node;
        lnkPrevious = lnkPrevious.next;
      }

      if(l1 == null || l1.next == null && l2 == null || l2.next == null){
        break;
      }

      l1 = l1 == null ? null : l1.next;
      l2 = l2 == null ? null : l2.next;
    }

    return toReturn;
  }
}
