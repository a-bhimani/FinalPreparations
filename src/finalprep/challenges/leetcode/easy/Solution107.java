package finalprep.challenges.leetcode.easy;

import finalprep.challenges.leetcode.commons.TreeNode;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author adb
 */
public class Solution107{

  public List<List<Integer>> levelOrderBottom(TreeNode root){
    LinkedList<List<Integer>> lstOrder = new LinkedList<>();
    Queue<TreeNode> qNodes = new LinkedList<>();

    qNodes.add(root);
    while(!qNodes.isEmpty()){
      int qSize = qNodes.size();
      LinkedList<Integer> lstNums = new LinkedList<>();

      while(qSize > 0){
        root = qNodes.poll();

        if(root != null){
          lstNums.addLast(root.val);
          qNodes.add(root.left);
          qNodes.add(root.right);
        }

        qSize--;
      }

      if(!lstNums.isEmpty()){
        lstOrder.addFirst(lstNums);
      }
    }

    return lstOrder;
  }
}
