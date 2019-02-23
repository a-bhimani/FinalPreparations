package finalprep.run;

import finalprep.challenges.interviews.amazon.HouseBits;
import finalprep.challenges.interviews.amazon.*;
import static java.lang.System.out;
import finalprep.challenges.leetcode.alternates.*;
import finalprep.challenges.leetcode.arrays.easy.*;
import finalprep.challenges.leetcode.commons.*;
import finalprep.challenges.leetcode.easy.*;
import finalprep.challenges.leetcode.linkedlists.easy.*;
import finalprep.challenges.leetcode.linkedlists.medium.*;
import finalprep.challenges.leetcode.mathematical.medium.*;
import finalprep.challenges.leetcode.matrix.easy.*;
import finalprep.challenges.leetcode.matrix.medium.*;
import finalprep.challenges.leetcode.strings.hard.*;
import finalprep.challenges.leetcode.strings.medium.*;
import finalprep.challenges.leetcode.strings.weekly.*;
import finalprep.challenges.leetcode.weekly.*;
import finalprep.misc.*;
import finalprep.sorting.*;
import java.util.List;
import finalprep.challenges.interviews.amazon.*;

/**
 *
 * @author adb
 */
public class FinalPreparations{

  public static void main(String[] args){
    List<Integer> l = new Solution30().findSubstring("ababaab", new String[]{"ab", "ba", "ba"});

    for(int i : l){
      out.println(i);
    }
    //new Solution92().reverseBetween(m1, 2, 3).PrintR();
  }
}
