package finalprep.challenges.leetcode.easy;

import finalprep.challenges.leetcode.commons.TreeNode;

/**
 *
 * @author adb
 */
public class Solution112{

  public boolean hasPathSum(TreeNode root, int sum){
    if(root == null){
      return false;
    }

    return hasSum(root, 0, sum);
  }

  private boolean hasSum(TreeNode root, int currSum, int target){
    if(root == null){
      return false;
    }

    currSum += root.val;

    if((root.left == null) && (root.right == null)){
      if(currSum == target){
        return true;
      }
    }

    return hasSum(root.left, currSum, target) || hasSum(root.right, currSum, target);
  }
}
