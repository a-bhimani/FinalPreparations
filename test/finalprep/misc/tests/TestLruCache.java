package finalprep.misc.tests;

import finalprep.challenges.leetcode.easy.tests.*;
import finalprep.misc.LruCache;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author adb
 */
public class TestLruCache{

  @Test
  public void run(){
    LruCache cache = new LruCache(2);

    cache.put(1, 1);
    cache.put(2, 2);
    assertEquals(cache.get(1), 1);
    cache.put(3, 3); //evicts key 2
    assertEquals(cache.get(2), -1);
    cache.put(4, 4); //evicts key 1
    assertEquals(cache.get(1), -1);
    assertEquals(cache.get(3), 3);
    assertEquals(cache.get(4), 4);
  }
}
