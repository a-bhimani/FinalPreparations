package finalprep.challenges.leetcode.easy;

import finalprep.challenges.leetcode.commons.Node;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 *
 * @author adb
 */
public class Solution429{

  public List<List<Integer>> levelOrder(Node root){
    LinkedList<List<Integer>> lstOrder = new LinkedList<>();
    Queue<Node> qNodes = new LinkedList<>();

    qNodes.add(root);
    while(!qNodes.isEmpty()){
      int qSize = qNodes.size();
      List<Integer> lstNums = new ArrayList<>();

      while(qSize > 0){
        root = qNodes.poll();

        if(root != null){
          lstNums.add(root.val);

          for(Node n : root.children){
            qNodes.add(n);
          }
        }

        qSize--;
      }

      if(!lstNums.isEmpty()){
        lstOrder.add(lstNums);
      }
    }

    return lstOrder;
  }
}
