package finalprep.challenges.leetcode.trees.hard;

import finalprep.challenges.leetcode.commons.TreeNode;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author adb
 */
public class Solution297{

  List<Integer> lstNums = new ArrayList<>();
  int ix = 0;

  // Encodes a tree to a single string.
  public List<Integer> serialize(TreeNode root){
    if(root == null){
      lstNums.add(null);
      return lstNums;
    }

    lstNums.add(root.val);
    serialize(root.left);
    serialize(root.right);

    return lstNums;
  }

  // Decodes your encoded data to tree.
  public TreeNode deserialize(List<Integer> data){
    if(ix >= data.size() || data.get(ix) == null){
      ix++;
      return null;
    }

    TreeNode t = new TreeNode(data.get(ix));
    ix++;

    t.left = deserialize(data);
    t.right = deserialize(data);

    return t;
  }
}
