package finalprep.challenges.leetcode.trees.medium;

import finalprep.challenges.leetcode.commons.TreeNode;
import java.util.Stack;

/**
 *
 * @author adb
 */
public class Solution173{

  Stack<TreeNode> s;

  public Solution173(TreeNode root){
    s = new Stack<>();

    while(root != null){
      s.push(root);
      root = root.left;
    }
  }

  /**
   * @return the next smallest number
   */
  public int next(){
    if(s.isEmpty()){
      return Integer.MIN_VALUE;
    }

    TreeNode root = s.pop();
    int i = root.val;

    root = root.right;
    while(root != null){
      s.push(root);
      root = root.left;
    }

    return i;
  }

  /**
   * @return whether we have a next smallest number
   */
  public boolean hasNext(){
    return !s.isEmpty();
  }
}
