package finalprep.challenges.leetcode.medium;

import finalprep.challenges.leetcode.easy.Solution242;
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
    List<List<String>> lstAng = new ArrayList<>();
    boolean[] angInfo = new boolean[strs.length];

    for(int ix = 0; ix < strs.length; ix++){
      List<String> lstGrp;
      char[] gChar;
      Set<String> set = new HashSet<>();

      if(angInfo[ix]){
        continue;
      }

      lstGrp = new ArrayList<>();
      lstGrp.add(strs[ix]);
      gChar = strs[ix].toCharArray();
      Arrays.sort(gChar);
      set.add(new String(gChar));

      for(int jy = ix + 1; jy < strs.length; jy++){
        if(strs[ix].length() == strs[jy].length()){
          gChar = strs[jy].toCharArray();
          Arrays.sort(gChar);

          if(set.contains(new String(gChar))){
            lstGrp.add(strs[jy]);
            angInfo[jy] = true;
          }
        }
      }

      lstAng.add(lstGrp);
    }

    return lstAng;
  }
}
