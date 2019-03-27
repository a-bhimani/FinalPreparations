package finalprep.challenges.leetcode.trees.medium;

import finalprep.challenges.leetcode.commons.TreeNode;
import finalprep.misc.TreeDfs;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 *
 * @author adb
 */
public class Solution144{

  public List<Integer> preorderTraversal(TreeNode root){
    return new TreeDfs(root).PreOrder();
  }

  public List<Integer> preorderTraversalLinear(TreeNode root){
    List<Integer> lstNums = new LinkedList<>();
    Stack<TreeNode> stkNodes = new Stack<>();

    stkNodes.add(root);
    while(!stkNodes.isEmpty()){
      root = stkNodes.pop();

      if(root != null){
        lstNums.add(root.val);
        stkNodes.add(root.right);
        stkNodes.add(root.left);
      }
    }

    return lstNums;
  }
}
