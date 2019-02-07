package finalprep.challenges.leetcode.linkedlists.easy;

import finalprep.challenges.leetcode.commons.ListNode;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author adb
 */
public class Solution141{

  public boolean hasCycle(ListNode head){
    Set<ListNode> setNodes = new HashSet<>();

    while(head != null){
      if(setNodes.contains(head)){
        return true;
      }

      setNodes.add(head);
      head = head.next;
    }

    return false;
  }
}
