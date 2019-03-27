package finalprep.challenges.leetcode.trees.easy;

import finalprep.challenges.leetcode.commons.TreeNode;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author adb
 */
public class Solution872{

  public boolean leafSimilar(TreeNode root1, TreeNode root2){
    List<Integer> l1 = new LinkedList<>();
    List<Integer> l2 = new LinkedList<>();

    getLeaves(root1, l1);
    getLeaves(root2, l2);

    return l1.equals(l2);
  }

  private void getLeaves(TreeNode r, List<Integer> l){
    if(r == null){
      return;
    }

    if(r.left == null && r.right == null){
      l.add(r.val);
    }

    getLeaves(r.left, l);
    getLeaves(r.right, l);
  }
}
