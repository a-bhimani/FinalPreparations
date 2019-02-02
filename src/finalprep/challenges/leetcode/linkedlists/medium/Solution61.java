package finalprep.challenges.leetcode.linkedlists.medium;

import finalprep.challenges.leetcode.commons.ListNode;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author adb
 */
public class Solution61{

  public ListNode rotateRight(ListNode head, int k){
    Queue<Integer> qNums = new LinkedList<>();
    int qLen = 0;
    ListNode prevNode = null;
    ListNode prevHead = null;
    ListNode retNode = null;
    ListNode retHead = null;

    if(head == null || head.next == null){
      return head;
    }

    while(head != null){
      qNums.offer(head.val);
      head = head.next;
    }

    qLen = qNums.size();
    if(k > qLen){
      k = k % qLen;
    }

    k = qLen - k;
    while(k > 0){
      if(prevNode == null){
        prevNode = new ListNode(qNums.poll());
        prevHead = prevNode;
      }else{
        prevNode.next = new ListNode(qNums.poll());
        prevNode = prevNode.next;
      }

      k--;
    }

    while(!qNums.isEmpty()){
      if(retNode == null){
        retNode = new ListNode(qNums.poll());
        retHead = retNode;
      }else{
        retNode.next = new ListNode(qNums.poll());
        retNode = retNode.next;
      }
    }

    if(retHead == null){
      retHead = prevHead;
    }else{
      retNode.next = prevHead;
    }

    return retHead;
  }
}
