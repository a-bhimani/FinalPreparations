package finalprep.challenges.leetcode.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author adb
 */
public class Solution17{

  public List<String> letterCombinations(String digits){
    List<String> lstAns = new ArrayList<>();
    Map<Integer, Character[]> numMaps = new HashMap<>();

    numMaps.put(0, new Character[]{});
    numMaps.put(1, new Character[]{});
    numMaps.put(2, new Character[]{'a', 'b', 'c'});
    numMaps.put(3, new Character[]{'d', 'e', 'f'});
    numMaps.put(4, new Character[]{'g', 'h', 'i'});
    numMaps.put(5, new Character[]{'j', 'k', 'l'});
    numMaps.put(6, new Character[]{'m', 'n', 'o'});
    numMaps.put(7, new Character[]{'p', 'q', 'r', 's'});
    numMaps.put(8, new Character[]{'t', 'u', 'v'});
    numMaps.put(9, new Character[]{'w', 'x', 'y', 'z'});

    return lstAns;
  }
}
