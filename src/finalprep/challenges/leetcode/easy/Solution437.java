package finalprep.challenges.leetcode.easy;

import finalprep.challenges.leetcode.commons.TreeNode;

/**
 *
 * @author adb
 */
public class Solution437{

  private int count = 0;

  public int pathSum(TreeNode root, int sum){
    if(root == null){
      return 0;
    }

    countPathSum(root, 0, sum);
    return count;
  }

  private void countPathSum(TreeNode root, int currSum, int target){
    if(root != null){
      currSum += root.val;
      if(currSum >= target){
        if(currSum == target){
          count++;
        }

        currSum = root.val;
      }

      if(root.left != null){
        countPathSum(root.left, currSum, target);
      }

      if(root.right != null){
        countPathSum(root.right, currSum, target);
      }
    }
  }
}
