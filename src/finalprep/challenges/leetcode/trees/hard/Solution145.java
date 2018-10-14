package finalprep.challenges.leetcode.trees.hard;

import finalprep.challenges.leetcode.commons.TreeNode;
import finalprep.misc.TreeDfs;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 *
 * @author adb
 */
public class Solution145{

  public List<Integer> postorderTraversal(TreeNode root){
    return new TreeDfs(root).PostOrder();
  }

  public List<Integer> postorderTraversalLinear(TreeNode root){
    LinkedList<Integer> lstNums = new LinkedList<>();
    Stack<TreeNode> stkNodes = new Stack<>();

    stkNodes.add(root);
    while(!stkNodes.isEmpty()){
      root = stkNodes.pop();

      if(root != null){
        lstNums.addFirst(root.val);
        stkNodes.add(root.left);
        stkNodes.add(root.right);
      }
    }

    return lstNums;
  }
}
