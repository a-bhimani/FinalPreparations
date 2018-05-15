package finalprep.challenges.leetcode.medium;

import finalprep.challenges.leetcode.commons.ListNode;

/**
 *
 * @author adb
 */
public class Solution92{

  public ListNode reverseBetween(ListNode head, int m, int n){
    ListNode prevNode = null;
    ListNode firstHead = null;
    int ix = 0;

    while(head != null){
      ListNode link = new ListNode(head.val);

      if(firstHead == null){
        firstHead = link;
      }

      if(prevNode != null){
        prevNode.next = link;
      }

      prevNode = link;

      if(ix == m){
        ListNode reverseHead = null;

        while(ix <= n && head != null){
          ListNode pNode = reverseHead;

          reverseHead = new ListNode(head.val);
          reverseHead.next = pNode;
          head = head.next;
          ix++;
        }

        prevNode.next = reverseHead;

      }else{

        head = head.next;
        ix++;
      }
    }

    return firstHead;
  }
}
