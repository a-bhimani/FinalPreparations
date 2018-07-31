package finalprep.challenges.leetcode.medium;

import finalprep.challenges.leetcode.commons.TreeNode;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 *
 * @author adb
 */
public class Solution103{

  public List<List<Integer>> zigzagLevelOrder(TreeNode root){
    LinkedList<List<Integer>> lstOrder = new LinkedList<>();
    Queue<TreeNode> qNodes = new LinkedList<>();
    boolean bZag = false;

    qNodes.add(root);
    while(!qNodes.isEmpty()){
      int qSize = qNodes.size();
      LinkedList<Integer> lstNums = new LinkedList<>();

      while(qSize > 0){
        root = qNodes.poll();

        if(root != null){
          if(bZag){
            lstNums.addFirst(root.val);
          }else{
            lstNums.addLast(root.val);
          }

          qNodes.add(root.left);
          qNodes.add(root.right);
        }

        qSize--;
      }

      if(!lstNums.isEmpty()){
        lstOrder.add(lstNums);
        bZag = !bZag;
      }
    }

    return lstOrder;
  }
}
