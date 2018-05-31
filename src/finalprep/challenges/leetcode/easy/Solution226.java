package finalprep.challenges.leetcode.easy;

import finalprep.challenges.leetcode.commons.TreeNode;

/**
 *
 * @author adb
 */
public class Solution226{

  public TreeNode invertTree(TreeNode root){
    TreeNode newNode;

    if(root == null){
      return null;
    }

    newNode = new TreeNode(root.val);
    newNode.left = invertTree(root.right);
    newNode.right = invertTree(root.left);

    return newNode;
  }
}
