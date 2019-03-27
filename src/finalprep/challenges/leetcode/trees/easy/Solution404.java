package finalprep.challenges.leetcode.trees.easy;

import finalprep.challenges.leetcode.commons.TreeNode;

/**
 *
 * @author adb
 */
public class Solution404{

  public int sumOfLeftLeaves(TreeNode root){
    return sumOfLeftLeaves(root, false);
  }

  private int sumOfLeftLeaves(TreeNode root, boolean read){
    if(root == null){
      return 0;
    }

    int i = 0;
    i += sumOfLeftLeaves(root.left, true);
    i += sumOfLeftLeaves(root.right, false);
    i += read && root.left == null && root.right == null ? root.val : 0;

    return i;
  }
}
