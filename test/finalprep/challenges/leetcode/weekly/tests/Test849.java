package finalprep.challenges.leetcode.weekly.tests;

import finalprep.challenges.leetcode.weekly.Solution849;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author adb
 */
public class Test849{

  @Test
  public void run(){
    assertEquals(new Solution849().maxDistToClosest(new int[]{1, 0, 0, 0, 1, 0, 1}), 2);
    assertEquals(new Solution849().maxDistToClosest(new int[]{1, 0, 0, 0}), 3);
    assertEquals(new Solution849().maxDistToClosest(new int[]{0, 1, 0, 0, 0, 1, 1, 0, 1, 1}), 2);
    assertEquals(new Solution849().maxDistToClosest(new int[]{0, 0, 0, 0, 1, 0, 1}), 4);
    assertEquals(new Solution849().maxDistToClosest(new int[]{1, 0, 0, 0, 1, 0, 0}), 2);
  }
}
