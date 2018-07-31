package finalprep.challenges.leetcode.commons;

import java.util.List;

/**
 *
 * @author adb
 */
public class Node{

  public int val;
  public List<Node> children;

  private Node(){

  }

  public Node(int _val, List<Node> _children){
    this.val = _val;
    this.children = _children;
  }
}
