package finalprep.challenges.leetcode.weekly.tests;

import finalprep.challenges.leetcode.matrix.weekly.Solution867;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author adb
 */
public class Test868{

  @Test
  public void run(){
    assertArrayEquals(new Solution867().transpose(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}), new int[][]{{1, 4, 7}, {2, 5, 8}, {3, 6, 9}});
    assertArrayEquals(new Solution867().transpose(new int[][]{{1, 2, 3}, {4, 5, 6}}), new int[][]{{1, 4}, {2, 5}, {3, 6}});
  }
}
