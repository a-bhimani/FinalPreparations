package finalprep.run;

import finalprep.challenges.leetcode.commons.ListNode;
import static java.lang.System.out;
import finalprep.challenges.leetcode.alternates.*;
import finalprep.challenges.leetcode.easy.*;
import finalprep.challenges.leetcode.medium.*;
import finalprep.challenges.leetcode.hard.*;
import finalprep.challenges.leetcode.weekly.*;
import finalprep.misc.LinkedListCopy;
import finalprep.misc.StockSpanning;
import finalprep.sorting.Sorter;
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

    //new Solution92().reverseBetween(m1, 2, 3).PrintR();
  }
}
