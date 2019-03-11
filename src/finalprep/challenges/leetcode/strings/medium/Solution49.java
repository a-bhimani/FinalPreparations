package finalprep.challenges.leetcode.strings.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author adb
 */
public class Solution49{

  public List<List<String>> groupAnagrams(String[] strs){
    Map<String, List<String>> mp = new HashMap<>();

    for(int ix = 0; ix < strs.length; ix++){
      char[] strChars = strs[ix].toCharArray();
      String sortString;

      Arrays.sort(strChars);
      sortString = String.valueOf(strChars);

      if(!mp.containsKey(sortString)){
        mp.put(sortString, new ArrayList());
      }

      mp.get(sortString).add(strs[ix]);
    }

    return new ArrayList(mp.values());
  }
}
