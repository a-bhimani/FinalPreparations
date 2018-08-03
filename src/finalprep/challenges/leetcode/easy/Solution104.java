package finalprep.challenges.leetcode.easy;

import finalprep.challenges.leetcode.commons.TreeNode;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author adb
 */
public class Solution104{

  public int maxDepth(TreeNode root){
    Queue<TreeNode> qNodes;
    int i = 0;

    if(root != null){
      qNodes = new LinkedList<>();
      qNodes.add(root);
      while(!qNodes.isEmpty()){
        int nSize = qNodes.size();

        i++;
        while(nSize > 0){
          root = qNodes.poll();

          if(root.left != null){
            qNodes.add(root.left);
          }

          if(root.right != null){
            qNodes.add(root.right);
          }

          nSize--;
        }
      }
    }

    return i;
  }

  public int maxDepthRecursive(TreeNode root){
    if(root == null){
      return 0;
    }

    return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
  }
}
