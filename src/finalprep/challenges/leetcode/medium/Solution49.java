package finalprep.challenges.leetcode.medium;

import finalprep.challenges.leetcode.easy.Solution242;
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

        lstGrp.add(strs[ix]);
        angInfo[ix] = true;

        for(int jy = ix + 1; jy < strs.length; jy++){
          if(new Solution242().isAnagram(strs[ix], strs[jy])){
            lstGrp.add(strs[jy]);
            angInfo[jy] = true;
          }
        }

        lstAng.add(lstGrp);
      }
    }

    return lstAng;
  }
}
