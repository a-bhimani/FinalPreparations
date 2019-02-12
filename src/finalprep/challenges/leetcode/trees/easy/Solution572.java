package finalprep.challenges.leetcode.trees.easy;

import finalprep.challenges.leetcode.commons.TreeNode;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author adb
 */
public class Solution572{

  public boolean isSubtree(TreeNode s, TreeNode t){
    boolean isSubtree = false;
    Queue<TreeNode> mainTree;

    if(s == null && t == null){
      return true;
    }

    if(s == null || t == null){
      return false;
    }

    mainTree = new LinkedList<>();
    mainTree.add(s);

    while(!mainTree.isEmpty() && !isSubtree){
      TreeNode mainLink = mainTree.poll();

      if(mainLink.left != null){
        mainTree.add(mainLink.left);
      }

      if(mainLink.right != null){
        mainTree.add(mainLink.right);
      }

      if(mainLink.val == t.val){
        boolean subSubtree = true;
        Queue<TreeNode> mudTree = new LinkedList<>();
        Queue<TreeNode> subTree = new LinkedList<>();

        mudTree.add(mainLink);
        subTree.add(t);

        while(!subTree.isEmpty() && subSubtree){
          TreeNode mudLink = mudTree.poll();
          TreeNode subLink = subTree.poll();

          if(mudLink.val != subLink.val){
            subSubtree = false;
          }

          if(subLink.left != null){
            if(mudLink.left == null){
              subSubtree = false;
            }

            mudTree.add(mudLink.left);
            subTree.add(subLink.left);
          }else{
            if(mudLink.left != null){
              subSubtree = false;
            }
          }

          if(subLink.right != null){
            if(mudLink.right == null){
              subSubtree = false;
            }

            mudTree.add(mudLink.right);
            subTree.add(subLink.right);
          }else{
            if(mudLink.right != null){
              subSubtree = false;
            }
          }
        }

        if(subSubtree){
          isSubtree = true;
        }
      }
    }

    return isSubtree;
  }

  public boolean isSubtreeRecursive(TreeNode s, TreeNode t){
    if(t == null){
      return true;
    }

    if(s == null){
      if(t != null){
        return false;
      }
    }

    if(s.val == t.val){
      if(isSubtreeRecursive(s.left, t.left) && isSubtreeRecursive(s.right, t.right)){
        return true;
      }
    }

    return isSubtreeRecursive(t, s.left) || isSubtreeRecursive(t, s.right);
  }
}
