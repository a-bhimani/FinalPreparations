package finalprep.challenges.leetcode.linkedlists.medium;

import finalprep.challenges.leetcode.commons.ListNode;
import java.util.Stack;

/**
 *
 * @author adb
 */
public class Solution92{

  public ListNode reverseBetween(ListNode head, int m, int n){
    int ix = 1;
    ListNode firstHead = null;
    ListNode prevNode = null;

    while(head != null){
      Stack<Integer> stkRev = new Stack<>();

      if(ix == m){
        while(ix <= n){
          stkRev.push(head.val);
          head = head.next;
          ix++;
        }
      }

      if(!stkRev.isEmpty()){
        while(!stkRev.isEmpty()){
          if(prevNode == null){
            prevNode = new ListNode(stkRev.pop());
          }else{
            prevNode.next = new ListNode(stkRev.pop());
          }

          if(firstHead == null){
            firstHead = prevNode;
          }

          if(prevNode.next != null){
            prevNode = prevNode.next;
          }
        }
      }else{

        if(prevNode == null){
          prevNode = new ListNode(head.val);
        }else{
          prevNode.next = new ListNode(head.val);
        }

        if(firstHead == null){
          firstHead = prevNode;
        }

        if(prevNode.next != null){
          prevNode = prevNode.next;
        }

        head = head.next;
        ix++;
      }
    }

    return firstHead;
  }
}
