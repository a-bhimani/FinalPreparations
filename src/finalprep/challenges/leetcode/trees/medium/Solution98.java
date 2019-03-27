package finalprep.challenges.leetcode.trees.medium;

import finalprep.challenges.leetcode.commons.TreeNode;
import java.util.Stack;

/**
 *
 * @author adb
 */
public class Solution98{

  public boolean isValidBST(TreeNode root){
    Stack<TreeNode> s = new Stack<>();
    Integer last = null;

    if(root != null){
      while(root != null || !s.isEmpty()){
        while(root != null){
          s.push(root);
          root = root.left;
        }

        root = s.pop();
        if(last != null){
          if(root.val <= last){
            return false;
          }
        }

        last = root.val;
        root = root.right;
      }
    }

    return true;
  }
}
