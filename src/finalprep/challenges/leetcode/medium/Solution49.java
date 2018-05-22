package finalprep.challenges.leetcode.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author adb
 */
public class Solution49{

  public List<List<String>> groupAnagrams(String[] strs){
    List<List<String>> lstAng = new ArrayList<>();
    boolean[] angInfo = new boolean[strs.length];

    for(int ix = 0; ix < strs.length; ix++){
      if(!angInfo[ix]){
        List<String> lstGrp = new ArrayList<>();
        Map<Character, Integer> charSet = new HashMap<>();

        lstGrp.add(strs[ix]);
        angInfo[ix] = true;

        for(int jy = 0; jy < strs[ix].length(); jy++){
          Character ch = strs[ix].charAt(jy);
          Integer ct = charSet.getOrDefault(ch, 0) + 1;

          charSet.put(ch, ct);
        }

        for(int jy = ix + 1; jy < strs.length; jy++){
          if((strs[ix].length() == strs[jy].length()) && isAnagram(charSet, strs[jy])){
            lstGrp.add(strs[jy]);
            angInfo[jy] = true;
          }
        }

        lstAng.add(lstGrp);
      }
    }

    return lstAng;
  }

  public boolean isAnagram(Map<Character, Integer> charSet, String t){
    boolean b = true;

    for(int ix = 0; ix < t.length(); ix++){
      Character ch = t.charAt(ix);
      Integer ct = charSet.getOrDefault(ch, 0) - 1;

      if(ct == -1){
        b = false;
        break;
      }else{
        charSet.put(ch, ct);
      }
    }

    return b;
  }
}
