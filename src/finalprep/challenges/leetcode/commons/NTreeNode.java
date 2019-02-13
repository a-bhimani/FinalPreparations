package finalprep.challenges.leetcode.commons;

import java.util.List;

/**
 *
 * @author adb
 */
public class NTreeNode{

  public int val;
  public List<NTreeNode> children;

  private NTreeNode(){

  }

  public NTreeNode(int x){
    val = x;
  }
}
