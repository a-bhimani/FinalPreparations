package finalprep.challenges.leetcode.medium;

import finalprep.challenges.leetcode.commons.TreeNode;
import finalprep.misc.TreeDfs;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author adb
 */
public class Solution94{

  public List<Integer> inorderTraversal(TreeNode root){
    return new TreeDfs(root).InOrder();
  }
}
