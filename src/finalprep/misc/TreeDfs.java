package finalprep.misc;

import finalprep.challenges.leetcode.commons.TreeNode;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author adb
 */
public class TreeDfs{

  private TreeNode root;

  private TreeDfs(){

  }

  public TreeDfs(TreeNode root){
    this.root = root;
  }

  private void inOrder(List<Integer> lstNums, TreeNode node){
    if(node != null){
      inOrder(lstNums, node.left);
      lstNums.add(node.val);
      inOrder(lstNums, node.right);
    }
  }

  private void preOrder(List<Integer> lstNums, TreeNode node){
    if(node != null){
      lstNums.add(node.val);
      preOrder(lstNums, node.left);
      preOrder(lstNums, node.right);
    }
  }

  private void postOrder(List<Integer> lstNums, TreeNode node){
    if(node != null){
      postOrder(lstNums, node.left);
      postOrder(lstNums, node.right);
      lstNums.add(node.val);
    }
  }

  public List<Integer> InOrder(){
    List<Integer> lstNums = new ArrayList<>();
    inOrder(lstNums, this.root);
    return lstNums;
  }

  public List<Integer> PreOrder(){
    List<Integer> lstNums = new ArrayList<>();
    preOrder(lstNums, this.root);
    return lstNums;
  }

  public List<Integer> PostOrder(){
    List<Integer> lstNums = new ArrayList<>();
    postOrder(lstNums, this.root);
    return lstNums;
  }
}
