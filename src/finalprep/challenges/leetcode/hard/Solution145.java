package finalprep.challenges.leetcode.hard;

import finalprep.challenges.leetcode.commons.TreeNode;
import finalprep.misc.TreeDfs;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author adb
 */
public class Solution145{

  public List<Integer> postorderTraversal(TreeNode root){
    return new TreeDfs(root).PostOrder();
  }

  public List<Integer> postorderTraversalLinear(TreeNode root){

    return null;
  }
}
