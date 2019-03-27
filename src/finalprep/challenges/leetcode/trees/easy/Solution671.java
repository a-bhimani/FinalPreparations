package finalprep.challenges.leetcode.trees.easy;

import finalprep.challenges.leetcode.commons.TreeNode;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author adb
 */
public class Solution671{

  public int findSecondMinimumValue(TreeNode root){
    Set<Integer> mp = new TreeSet<>();
    Queue<TreeNode> qNodes = new LinkedList<>();

    qNodes.offer(root);
    while(!qNodes.isEmpty()){
      root = qNodes.poll();

      mp.add(root.val);
      if(root.left != null){
        qNodes.offer(root.left);
      }

      if(root.right != null){
        qNodes.offer(root.right);
      }
    }

    if(mp.size() == 1){
      return -1;
    }

    return (int)mp.toArray()[1];
  }
}
