package finalprep.challenges.leetcode.strings.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author adb
 */
public class Solution438{

  public List<Integer> findAnagrams(String s, String p){
    HashMap<Character, Integer> m = new HashMap<>();
    List<Integer> lstInd = new LinkedList<>();

    for(int ix = 0; ix < p.length(); ix++){
      m.put(p.charAt(ix), m.getOrDefault(p.charAt(ix), 0) + 1);
    }

    for(int ix = 0; ix < s.length() - (p.length() - 1); ix++){
      int i = isAnalogous(s.substring(ix, ix + p.length()), new HashMap(m));

      if(i == p.length()){
        lstInd.add(ix);
      }else{
        ix += i;
      }
    }

    return lstInd;
  }

  private int isAnalogous(String s, Map<Character, Integer> m){
    int ct = 0;

    for(int ix = 0; ix < s.length(); ix++){
      int c = m.getOrDefault(s.charAt(ix), 0);

      if(c <= 0){
        return ct;
      }

      m.put(s.charAt(ix), c - 1);
    }

    return s.length();
  }
}
