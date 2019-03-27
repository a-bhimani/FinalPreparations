package finalprep.challenges.leetcode.trees.easy;

import finalprep.challenges.leetcode.commons.TreeNode;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author adb
 */
public class Solution110{

  public boolean isBalanced(TreeNode root){
    int i = 0;
    boolean fail = false;
    Queue<TreeNode> q = new LinkedList<>();

    if(root == null){
      return true;
    }

    q.offer(root);
    while(!q.isEmpty()){
      int qS = q.size();
      int eS = (int)Math.pow(2, i);

      if(qS < eS){
        if(fail){
          return false;
        }

        fail = true;
      }

      while(qS > 0){
        root = q.poll();

        if(root.left != null){
          q.offer(root.left);
        }

        if(root.right != null){
          q.offer(root.right);
        }

        qS--;
      }

      i++;
    }

    return true;
  }
}
