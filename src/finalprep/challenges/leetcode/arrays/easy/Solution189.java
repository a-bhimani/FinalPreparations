package finalprep.challenges.leetcode.arrays.easy;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author adb
 */
public class Solution189{

  public void rotate(int[] nums, int k){
    Queue<Integer> qRotated = new LinkedList<>();

    for(int ix = nums.length - 1; ix >= 0; ix--){
      qRotated.offer(nums[ix]);
    }

    k = k % nums.length;
    for(int ix = 1; ix <= k; ix++){
      qRotated.offer(qRotated.poll());
    }

    for(int ix = nums.length - 1; ix >= 0; ix--){
      nums[ix] = qRotated.poll();
    }
  }
}
