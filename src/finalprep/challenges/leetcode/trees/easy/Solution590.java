package finalprep.challenges.leetcode.trees.easy;

import finalprep.challenges.leetcode.commons.Node;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 *
 * @author adb
 */
public class Solution590{

  public List<Integer> postorder(Node root){
    LinkedList<Integer> l = new LinkedList<>();
    Stack<Node> s = new Stack<>();

    s.push(root);
    while(!s.isEmpty()){
      root = s.pop();

      if(root != null){
        for(Node n : root.children){
          s.push(n);
        }

        l.addFirst(root.val);
      }
    }

    return l;
  }
}
