package finalprep.challenges.leetcode.medium;

import finalprep.challenges.leetcode.commons.TreeNode;
import finalprep.misc.TreeDfs;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author adb
 */
public class Solution144{

  public List<Integer> preorderTraversal(TreeNode root){
    return new TreeDfs(root).PreOrder();
  }

  public List<Integer> preorderTraversalLinear(TreeNode root){

    return null;
  }
}
