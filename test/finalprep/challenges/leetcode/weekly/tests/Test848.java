package finalprep.challenges.leetcode.weekly.tests;

import finalprep.challenges.leetcode.strings.weekly.Solution848;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author adb
 */
public class Test848{

  @Test
  public void run(){
    assertEquals(new Solution848().shiftingLetters("abc", new int[]{3, 5, 9}), "rpl");
    assertEquals(new Solution848().shiftingLetters("mkgfzkkuxownxvfvxasy", new int[]{505870226, 437526072, 266740649, 224336793, 532917782, 311122363, 567754492, 595798950, 81520022, 684110326, 137742843, 275267355, 856903962, 148291585, 919054234, 467541837, 622939912, 116899933, 983296461, 536563513}), "wqqwlcjnkphhsyvrkdod");
  }
}
