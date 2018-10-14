package finalprep.challenges.leetcode.strings.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author adb
 */
public class Solution438{

  public List<Integer> findAnagrams(String s, String p){
    List<Integer> lstLx = new ArrayList<>();
    HashMap<Character, Integer> mpP1;

    if(s == null || s.length() == 0 || p == null || p.length() == 0){
      return lstLx;
    }

    if(s.length() < p.length()){
      return lstLx;
    }

    mpP1 = getCharHashMap(p);

    for(int ix = 0; ix <= s.length() - p.length(); ix++){
      boolean isAnagram = true;
      HashMap<Character, Integer> mpS1 = getCharHashMap(s.substring(ix, ix + p.length()));

      for(Map.Entry<Character, Integer> c : mpP1.entrySet()){
        Integer m = mpS1.getOrDefault(c.getKey(), 0);

        if(c.getValue() != m){
          isAnagram = false;
          break;
        }

        mpS1.remove(c.getKey());
      }

      if(isAnagram){
        lstLx.add(ix);
      }
    }

    return lstLx;
  }

  private HashMap<Character, Integer> getCharHashMap(String s){
    HashMap<Character, Integer> charMap = new HashMap<>();

    for(int ix = 0; ix < s.length(); ix++){
      Character ch = s.charAt(ix);
      Integer ct = charMap.getOrDefault(ch, 0) + 1;

      charMap.put(ch, ct);
    }

    return charMap;
  }
}
