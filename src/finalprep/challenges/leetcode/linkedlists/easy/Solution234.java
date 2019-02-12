package finalprep.challenges.leetcode.linkedlists.easy;

import finalprep.challenges.leetcode.commons.ListNode;

/**
 *
 * @author adb
 */
public class Solution234{

  public boolean isPalindrome(ListNode head){
    ListNode tmpHead = null;
    ListNode revCHead = null;
    boolean isOdd = false;
    int hlen = 0;

    if(head == null){
      return true;
    }

    tmpHead = head;
    while(tmpHead != null){
      hlen++;
      tmpHead = tmpHead.next;
    }

    isOdd = hlen % 2 == 1;
    hlen = hlen / 2;
    tmpHead = head;
    while(hlen > 0){
      ListNode prevNode = revCHead;

      revCHead = new ListNode(tmpHead.val);
      revCHead.next = prevNode;

      tmpHead = tmpHead.next;
      hlen--;
    }

    if(isOdd){
      tmpHead = tmpHead.next;
    }

    while(tmpHead != null){
      if(revCHead.val != tmpHead.val){
        return false;
      }

      revCHead = revCHead.next;
      tmpHead = tmpHead.next;
    }

    return true;
  }
}
