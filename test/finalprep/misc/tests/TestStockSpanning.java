package finalprep.misc.tests;

import finalprep.challenges.leetcode.easy.tests.*;
import finalprep.misc.StockSpanning;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author adb
 */
public class TestStockSpanning{

  @Test
  public void run(){
    assertArrayEquals(StockSpanning.calculateSpan(new int[]{100, 80, 60, 70, 60, 75, 85}), new int[]{1, 1, 1, 2, 1, 4, 6});
    assertArrayEquals(StockSpanning.calculateSpan(new int[]{2, 1, 2, 1, 0, 1, 2}), new int[]{1, 1, 3, 1, 1, 3, 7});
  }
}
