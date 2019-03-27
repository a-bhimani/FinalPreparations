package finalprep.challenges.leetcode.trees.medium;

import finalprep.challenges.leetcode.commons.TreeNode;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/**
 *
 * @author adb
 */
public class Solution236{

  public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q){
    Queue<TreeNode> qNodes = new LinkedList<>();
    Map<TreeNode, TreeNode> mpPTree = new HashMap<>();
    Set<TreeNode> stPIterate = new HashSet<>();

    if(root == null || (root == p && root == q)){
      return root;
    }

    qNodes.offer(root);
    while(!qNodes.isEmpty()){
      root = qNodes.poll();

      if(root.left != null){
        qNodes.offer(root.left);
        mpPTree.put(root.left, root);
      }

      if(root.right != null){
        qNodes.offer(root.right);
        mpPTree.put(root.right, root);
      }
    }

    while(p != null){
      stPIterate.add(p);
      p = mpPTree.getOrDefault(p, null);
    }

    while(q != null){
      if(stPIterate.contains(q)){
        return q;
      }

      q = mpPTree.getOrDefault(q, null);
    }

    return null;
  }
}
