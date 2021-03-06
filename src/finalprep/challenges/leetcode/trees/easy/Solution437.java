package finalprep.challenges.leetcode.trees.easy;

import finalprep.challenges.leetcode.commons.TreeNode;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author adb
 */
public class Solution437{

  public int pathSum(TreeNode root, int sum){
    int count = 0;
    Queue<TreeNode> qNodes = new LinkedList<>();

    if(root == null){
      return 0;
    }

    qNodes.offer(root);
    while(!qNodes.isEmpty()){
      root = qNodes.poll();

      count += pathSum(root, 0, sum);

      if(root.left != null){
        qNodes.offer(root.left);
      }

      if(root.right != null){
        qNodes.offer(root.right);
      }
    }

    return count;
  }

  private int pathSum(TreeNode root, int s, int sum){
    if(root == null){
      return 0;
    }

    s += root.val;

    if(s == sum){
      return 1;
    }

    return pathSum(root.left, s, sum) + pathSum(root.right, s, sum);
  }
}
