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
        while(ix >= m && ix <= n){

          ix++;
        }
      }

      head = head.next;
      ix++;
    }

    return firstHead;
  }
}
