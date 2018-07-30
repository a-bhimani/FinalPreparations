package finalprep.challenges.leetcode.easy;

import finalprep.challenges.leetcode.commons.TreeNode;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 *
 * @author adb
 */
public class Solution637{

  public List<Double> averageOfLevels(TreeNode root){
    LinkedList<Double> lstNums = new LinkedList<>();
    Queue<TreeNode> qNodes = new LinkedList<>();

    qNodes.add(root);
    while(!qNodes.isEmpty()){
      int qSize = qNodes.size();
      int div = 0;
      double d = 0;

      for(int ix = 0; ix < qSize; ix++){
        root = qNodes.poll();

        if(root != null){
          d += root.val;
          qNodes.add(root.left);
          qNodes.add(root.right);
          div++;
        }
      }

      if(div > 0){
        lstNums.add(d / div);
      }
    }

    return lstNums;
  }
}
