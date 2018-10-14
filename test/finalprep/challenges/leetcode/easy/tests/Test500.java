package finalprep.challenges.leetcode.easy.tests;

import finalprep.challenges.leetcode.strings.easy.Solution500;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author adb
 */
public class Test500{

  @Test
  public void run(){
    assertArrayEquals(new Solution500().findWords(new String[]{"Hello", "Alaska", "Dad", "Peace"}), new String[]{"Alaska", "Dad"});
  }
}
