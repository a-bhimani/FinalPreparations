package finalprep.challenges.interviews.amazon.tests;

import finalprep.challenges.interviews.amazon.Solution2Modified;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author adb
 */
public class Test2{

  @Test
  public void run(){
    Solution2Modified sol = new Solution2Modified();
    List<String> input = new ArrayList<>();
    String[] arrAns, arrExpAns;

    input.add("");
    input.add("");
    input.add("");
    input.add("");
    input.add("");
    arrAns = new String[input.size()];
    sol.reorderLines(arrAns.length, input).toArray(arrAns);
    arrExpAns = new String[]{"", "", "", "", ""};
    assertArrayEquals(arrAns, arrExpAns);
  }
}
