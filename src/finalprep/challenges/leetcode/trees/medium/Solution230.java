package finalprep.challenges.leetcode.trees.medium;

import finalprep.challenges.leetcode.commons.TreeNode;
import java.util.LinkedList;
import java.util.Stack;

/**
 *
 * @author adb
 */
public class Solution230{

  LinkedList<Integer> lstInorder;

  public int kthSmallest(TreeNode root, int k){
    lstInorder = new LinkedList<>();
    Stack<TreeNode> stkNodes = new Stack<>();

    while((root != null) || !stkNodes.empty()){
      while(root != null){
        stkNodes.push(root);
        root = root.left;
      }

      root = stkNodes.pop();
      lstInorder.add(root.val);
      root = root.right;
    }

    return lstInorder.get(k - 1);
  }

  private void inorderFwd(TreeNode n){
    if(n != null){
      inorderFwd(n.left);
      lstInorder.add(n.val);
      inorderFwd(n.right);
    }
  }
}
