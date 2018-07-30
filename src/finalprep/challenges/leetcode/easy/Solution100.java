package finalprep.challenges.leetcode.easy;

import finalprep.challenges.leetcode.commons.TreeNode;

/**
 *
 * @author adb
 */
public class Solution100{

  public boolean isSameTree(TreeNode p, TreeNode q){
    if(p == null && q == null){
      return true;
    }

    if((p == null || q == null) || p.val != q.val){
      return false;
    }

    return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
  }
}