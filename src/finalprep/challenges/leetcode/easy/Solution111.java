package finalprep.challenges.leetcode.easy;

import finalprep.challenges.leetcode.commons.TreeNode;

/**
 *
 * @author adb
 */
public class Solution111{

  public int minDepth(TreeNode root){
    if(root == null){
      return 0;
    }

    if(root.left == null && root.right == null){
      return 1;
    }

    return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
  }
}
