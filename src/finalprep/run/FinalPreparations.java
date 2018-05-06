package finalprep.run;

import finalprep.challenges.leetcode.commons.ListNode;
import static java.lang.System.out;
import finalprep.challenges.leetcode.easy.*;
import finalprep.challenges.leetcode.medium.*;
import finalprep.challenges.leetcode.weekly.*;
import finalprep.sorting.Sorter;

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
    Solution303 sol = new Solution303(new int[]{-2, 0, 3, -5, 2, -1});
    out.println(sol.sumRange(2, 5));
  }
}
