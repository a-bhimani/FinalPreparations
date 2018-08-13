package finalprep.challenges.leetcode.medium.tests;

import finalprep.challenges.leetcode.medium.Solution36;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author adb
 */
public class Test36{

  @Test
  public void run(){
    Solution36 sol = new Solution36();
    assertFalse(sol.isValidSudoku(new char[][]{new char[]{'.', '.', '.', '.', '5', '.', '.', '1', '.'}, new char[]{'.', '4', '.', '3', '.', '.', '.', '.', '.'}, new char[]{'.', '.', '.', '.', '.', '3', '.', '.', '1'}, new char[]{'8', '.', '.', '.', '.', '.', '.', '2', '.'}, new char[]{'.', '.', '2', '.', '7', '.', '.', '.', '.'}, new char[]{'.', '1', '5', '.', '.', '.', '.', '.', '.'}, new char[]{'.', '.', '.', '.', '.', '2', '.', '.', '.'}, new char[]{'.', '2', '.', '9', '.', '.', '.', '.', '.'}, new char[]{'.', '.', '4', '.', '.', '.', '.', '.', '.'}}));
  }

}
