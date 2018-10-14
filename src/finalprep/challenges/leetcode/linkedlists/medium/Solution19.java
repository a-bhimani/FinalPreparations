package finalprep.challenges.leetcode.linkedlists.medium;

import finalprep.challenges.leetcode.commons.ListNode;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author adb
 */
public class Solution19{

  public ListNode removeNthFromEnd(ListNode head, int n){
    List<ListNode> lstNodes = new ArrayList<>();
    int size = 0;

    while(head != null){
      lstNodes.add(0, head);
      head = head.next;
      size++;
    }

    if(size == 1){
      return null;
    }

    if(n >= size){
      return lstNodes.get(size - 2);
    }

    if(n >= 1){
      lstNodes.get(n).next = null;

      if((n - 2) >= 0){
        lstNodes.get(n).next = lstNodes.get(n - 2);
      }
    }

    return lstNodes.get(size - 1);
  }
}
