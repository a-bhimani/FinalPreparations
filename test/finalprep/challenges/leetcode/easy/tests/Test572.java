package finalprep.challenges.leetcode.easy.tests;

import finalprep.challenges.leetcode.commons.TreeNode;
import finalprep.challenges.leetcode.easy.Solution572;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author adb
 */
public class Test572{

  @Test
  public void run(){
    Solution572 sol = new Solution572();

    TreeNode b1 = new TreeNode(3);
    TreeNode b2 = new TreeNode(4);
    TreeNode b3 = new TreeNode(5);
    TreeNode b4 = new TreeNode(1);
    TreeNode b5 = new TreeNode(2);
    TreeNode b6 = null;
    TreeNode b7 = null;
    TreeNode b8 = new TreeNode(0);

    TreeNode b9 = new TreeNode(4);
    TreeNode b10 = new TreeNode(1);
    TreeNode b11 = new TreeNode(2);

    TreeNode c1 = new TreeNode(1);
    TreeNode c2 = new TreeNode(1);
    TreeNode c3 = new TreeNode(1);

    TreeNode t1 = new TreeNode(1);
    TreeNode t2 = null;
    TreeNode t3 = new TreeNode(1);
    TreeNode t4 = null;
    TreeNode t5 = new TreeNode(1);
    TreeNode t6 = null;
    TreeNode t7 = new TreeNode(1);
    TreeNode t8 = null;
    TreeNode t9 = new TreeNode(1);
    TreeNode t10 = null;
    TreeNode t11 = new TreeNode(1);
    TreeNode t12 = null;
    TreeNode t13 = new TreeNode(1);
    TreeNode t14 = null;
    TreeNode t15 = new TreeNode(1);
    TreeNode t16 = null;
    TreeNode t17 = new TreeNode(1);
    TreeNode t18 = null;
    TreeNode t19 = new TreeNode(1);
    TreeNode t20 = null;
    TreeNode t21 = new TreeNode(1);
    TreeNode t22 = new TreeNode(2);

    TreeNode t23 = new TreeNode(1);
    TreeNode t24 = null;
    TreeNode t25 = new TreeNode(1);
    TreeNode t26 = null;
    TreeNode t27 = new TreeNode(1);
    TreeNode t28 = null;
    TreeNode t29 = new TreeNode(1);
    TreeNode t30 = null;
    TreeNode t31 = new TreeNode(1);
    TreeNode t32 = null;
    TreeNode t33 = new TreeNode(1);
    TreeNode t34 = new TreeNode(2);

    b1.left = b2;
    b1.right = b3;
    b2.left = b4;
    b2.right = b5;
    b3.left = b6;
    b3.right = b6;
    b4.left = b8;

    b9.left = b10;
    b9.right = b11;

    c1.left = c2;

    t1.right = t3;
    t3.right = t5;
    t5.right = t7;
    t7.right = t9;
    t9.right = t11;
    t11.right = t13;
    t13.right = t15;
    t15.right = t17;
    t17.right = t19;
    t19.right = t21;
    t21.left = t22;

    t23.right = t25;
    t25.right = t27;
    t27.right = t29;
    t29.right = t31;
    t31.right = t33;
    t33.left = t34;

    assertFalse(sol.isSubtree(b1, b9));
    assertTrue(sol.isSubtree(c1, c3));
    assertTrue(sol.isSubtree(t1, t23));
  }
}
