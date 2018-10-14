package finalprep.challenges.leetcode.trees.easy;

import finalprep.challenges.leetcode.commons.TreeNode;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author adb
 */
public class Solution111{

  public int minDepth(TreeNode root){
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

          if((root.left == null) && (root.right == null)){
            return i;
          }

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

  public int minDepthRecursive(TreeNode root){
    if(root == null){
      return 0;
    }

    if(root.left == null){
      return 1 + minDepthRecursive(root.right);
    }

    if(root.right == null){
      return 1 + minDepthRecursive(root.left);
    }

    return 1 + Math.min(minDepthRecursive(root.left), minDepthRecursive(root.right));
  }
}
