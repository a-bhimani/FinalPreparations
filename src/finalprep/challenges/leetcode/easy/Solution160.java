package finalprep.challenges.leetcode.easy;

import finalprep.challenges.leetcode.commons.ListNode;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author adb
 */
public class Solution160{

  public ListNode getIntersectionNode(ListNode headA, ListNode headB){
    Set<Integer> setNodesA = new HashSet<>();

    while(headA != null){
      setNodesA.add(headA.val);
      headA = headA.next;
    }

    while(headB != null){
      if(setNodesA.contains(headB.val)){
        return headB;
      }

      headB = headB.next;
    }

    return null;
  }
}
