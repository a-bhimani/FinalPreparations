package finalprep.challenges.leetcode.trees.medium;

import finalprep.challenges.leetcode.commons.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 *
 * @author adb
 */
public class Solution102{

  public List<List<Integer>> levelOrder(TreeNode root){
    LinkedList<List<Integer>> lstOrder = new LinkedList<>();
    Queue<TreeNode> qNodes = new LinkedList<>();

    qNodes.add(root);
    while(!qNodes.isEmpty()){
      int qSize = qNodes.size();
      List<Integer> lstNums = new ArrayList<>();

      for(int ix = 0; ix < qSize; ix++){
        root = qNodes.poll();

        if(root != null){
          lstNums.add(root.val);
          qNodes.add(root.left);
          qNodes.add(root.right);
        }
      }

      if(lstNums.size() > 0){
        lstOrder.add(lstNums);
      }
    }

    return lstOrder;
  }
}
