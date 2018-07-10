package finalprep.misc;

import finalprep.challenges.leetcode.commons.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 *
 * @author adb
 */
public class TreeBfs{

  private TreeNode root;

  private TreeBfs(){

  }

  public TreeBfs(TreeNode root){
    this.root = root;
  }

  public List<Integer> levelOrder(){
    List<Integer> lstNums = new ArrayList<>();

    if(root != null){
      Queue<TreeNode> q = new LinkedList<>();

      q.add(root);
      while(!q.isEmpty()){
        TreeNode n = q.poll();

        lstNums.add(n.val);

        if(n.left != null){
          q.add(n.left);
        }

        if(n.right != null){
          q.add(n.right);
        }
      }
    }

    return lstNums;
  }
}
