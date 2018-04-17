package finalprep.challenges.leetcode.weekly;

import finalprep.challenges.leetcode.commons.ListNode;

/**
 *
 * @author adb
 */
public class Solution817{

  public int numComponents(ListNode head, int[] G){
    int ct = 0;
    boolean isPrev = false;

    while(head != null){
      boolean isCurr = contains(head.val, G);

      if(!isPrev && isCurr){
        ct++;
      }

      isPrev = isCurr;
      head = head.next;
    }

    return ct;
  }

  public boolean contains(int num, int[] nums){
    for(int ix = 0; ix < nums.length; ix++){
      if(nums[ix] == num){
        return true;
      }
    }

    return false;
  }
}
