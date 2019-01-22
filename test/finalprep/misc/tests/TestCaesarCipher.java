package finalprep.misc.tests;

import finalprep.misc.CaesarCipher;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author adb
 */
public class TestCaesarCipher{

  @Test
  public void run(){
    assertEquals(CaesarCipher.encrypt("ABCDEFGHIJKLMNOPQRSTUVWXYZ", 23), "XYZABCDEFGHIJKLMNOPQRSTUVW");
    assertEquals(CaesarCipher.encrypt("ATTACKATONCE", 4), "EXXEGOEXSRGI");
  }
}
