package finalprep.challenges.leetcode.trees.easy;

import finalprep.challenges.leetcode.commons.TreeNode;

/**
 *
 * @author adb
 */
public class Solution108{

  public TreeNode sortedArrayToBST(int[] nums){
    return sortedArrayToBST(nums, 0, nums.length - 1);
  }

  private TreeNode sortedArrayToBST(int[] nums, int l, int r){
    if(l > r){
      return null;
    }

    int mid = (l + r) / 2;
    TreeNode t = new TreeNode(nums[mid]);
    t.left = sortedArrayToBST(nums, l, mid - 1);
    t.right = sortedArrayToBST(nums, mid + 1, r);

    return t;
  }
}
