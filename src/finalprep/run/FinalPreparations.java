package finalprep.run;

import finalprep.challenges.interviews.amazon.*;
import static java.lang.System.out;
import finalprep.challenges.leetcode.alternates.*;
import finalprep.challenges.leetcode.commons.*;
import finalprep.challenges.leetcode.easy.*;
import finalprep.challenges.leetcode.medium.*;
import finalprep.challenges.leetcode.hard.*;
import finalprep.challenges.leetcode.weekly.*;
import finalprep.misc.*;
import finalprep.sorting.*;
import java.util.List;

/**
 *
 * @author adb
 */
public class FinalPreparations{

  public static void main(String[] args){
//    int[] nums1 = new int[]{2, 4, 6, 8, 0, 0, 0};
//    int[] nums2 = new int[]{3, 7, 8};
//
//    new Solution88().merge(nums1, 7, nums2, 3);
//    Sorter.PrintArray("sorted=", nums1);

    ListNode n1 = new ListNode(1);
    ListNode n2 = new ListNode(3);
    ListNode n3 = new ListNode(5);
    ListNode n4 = new ListNode(7);
    ListNode n5 = new ListNode(9);
    ListNode n6 = new ListNode(11);
    n1.next = n2;
    n2.next = n3;
    n3.next = n4;
    n4.next = n5;
    n5.next = n6;

    ListNode l1 = new ListNode(2);
    ListNode l2 = new ListNode(4);
    ListNode l3 = new ListNode(9);
    ListNode l4 = new ListNode(11);
    l1.next = l2;
    l2.next = l3;
    l3.next = l4;

    ListNode m1 = new ListNode(1);
    ListNode m2 = new ListNode(2);
    ListNode m3 = new ListNode(3);
    ListNode m4 = new ListNode(4);
    ListNode m5 = new ListNode(5);
    m1.next = m2;
    m2.next = m3;
    m3.next = m4;
    m4.next = m5;

    TreeNode b1 = new TreeNode(1);
    TreeNode b2 = new TreeNode(2);
    TreeNode b3 = new TreeNode(3);
    TreeNode b4 = new TreeNode(4);
    TreeNode b5 = new TreeNode(5);
    b1.left = b2;
    b1.right = b3;
    b2.left = b4;
    b2.right = b5;

    SolutionPhone sol = new SolutionPhone();

    //out.print(new Solution29().divide(-2147483648, 2));
    //new Solution92().reverseBetween(m1, 2, 3).PrintR();
  }
}
