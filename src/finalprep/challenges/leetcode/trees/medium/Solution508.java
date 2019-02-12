package finalprep.challenges.leetcode.trees.medium;

import finalprep.challenges.leetcode.commons.TreeNode;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/**
 *
 * @author adb
 */
public class Solution508{

  public int[] findFrequentTreeSum(TreeNode root){
    Queue<TreeNode> qNodes = new LinkedList<>();
    Map<Integer, Integer> mpCounts = new HashMap<>();
    int stillMax = 0;
    int aSize = 0;
    int[] result;

    if(root == null){
      return new int[]{};
    }

    TreeNode sumRoot = sumTree(root);
    qNodes.offer(sumRoot);
    while(!qNodes.isEmpty()){
      TreeNode node = qNodes.poll();
      int currCt = mpCounts.getOrDefault(node.val, 0) + 1;

      if(node.left != null){
        qNodes.offer(node.left);
      }

      if(node.right != null){
        qNodes.offer(node.right);
      }

      mpCounts.put(node.val, currCt);
      stillMax = Math.max(currCt, stillMax);
    }

    for(int k : mpCounts.keySet()){
      if(mpCounts.getOrDefault(k, 0) == stillMax){
        aSize++;
      }
    }

    result = new int[aSize];
    for(int k : mpCounts.keySet()){
      if(mpCounts.getOrDefault(k, 0) == stillMax){
        result[aSize - 1] = k;
        aSize--;
      }
    }

    return result;
  }

  private TreeNode sumTree(TreeNode t){
    TreeNode newNode;

    if(t == null){
      return null;
    }

    newNode = new TreeNode(t.val);
    newNode.left = sumTree(t.left);
    newNode.right = sumTree(t.right);

    if(newNode.left != null){
      newNode.val += newNode.left.val;
    }

    if(newNode.right != null){
      newNode.val += newNode.right.val;
    }

    return newNode;
  }
}
