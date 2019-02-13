package finalprep.challenges.leetcode.trees.easy;

import finalprep.challenges.leetcode.commons.Node;

/**
 *
 * @author adb
 */
public class Solution559{

  public int maxDepth(Node root){
    int max = 0;

    if(root == null){
      return max;
    }

    for(Node child : root.children){
      max = Math.max(max, maxDepth(child));
    }

    return max + 1;
  }
}
