package finalprep.run;

import finalprep.challenges.leetcode.commons.ListNode;
import static java.lang.System.out;
import finalprep.challenges.leetcode.easy.*;
import finalprep.challenges.leetcode.medium.*;
import finalprep.challenges.leetcode.weekly.*;
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

    Solution825 sol = new Solution825();
    out.println(sol.numFriendRequests(new int[]{16, 16, 16}));
    out.println(sol.numFriendRequests(new int[]{16, 17, 18}));
    out.println(sol.numFriendRequests(new int[]{73, 106, 39, 6, 26, 15, 30, 100, 71, 35, 46, 112, 6, 60, 110}));
  }
}
