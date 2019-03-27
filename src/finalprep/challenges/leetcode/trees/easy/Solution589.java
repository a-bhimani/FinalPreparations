package finalprep.challenges.leetcode.trees.easy;

import finalprep.challenges.leetcode.commons.Node;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 *
 * @author adb
 */
public class Solution589{

  public List<Integer> preorder(Node root){
    List<Integer> l = new LinkedList<>();
    Stack<Node> s = new Stack<>();

    s.push(root);
    while(!s.isEmpty()){
      root = s.pop();

      if(root != null){
        l.add(root.val);

        Collections.reverse(root.children);
        for(Node n : root.children){
          s.push(n);
        }
      }
    }

    return l;
  }
}
