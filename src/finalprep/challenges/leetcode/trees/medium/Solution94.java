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
public class Solution94{

  public List<Integer> inorderTraversal(TreeNode root){
    return new TreeDfs(root).InOrder();
  }

  public List<Integer> inorderTraversalLinear(TreeNode root){
    List<Integer> lstNums = new LinkedList<>();
    Stack<TreeNode> stkNodes = new Stack<>();

    while((root != null) || !stkNodes.empty()){
      while(root != null){
        stkNodes.push(root);
        root = root.left;
      }

      root = stkNodes.pop();
      lstNums.add(root.val);
      root = root.right;
    }

    return lstNums;
  }
}
