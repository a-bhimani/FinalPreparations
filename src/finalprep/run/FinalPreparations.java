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

    //out.print(new Solution29().divide(-2147483648, 2));
    //new Solution92().reverseBetween(m1, 2, 3).PrintR();
    out.print(new Solution121().maxProfit(new int[]{1, -9, 5, 3, -3, 2, 0, 7}));
  }
}
