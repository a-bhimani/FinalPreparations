package finalprep.challenges.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author adb
 */
public class Solution242{

  public boolean isAnagram(String s, String t){
    Map<Character, Integer> charSet = new HashMap<Character, Integer>();
    boolean b = true;

    if(s.length() != t.length()){
      b = false;
    }else{
      for(int ix = 0; ix < s.length(); ix++){
        Character ch = s.charAt(ix);
        Integer ct = charSet.getOrDefault(ch, 0) + 1;

        charSet.put(ch, ct);
      }

      for(int ix = 0; ix < s.length(); ix++){
        Character ch = t.charAt(ix);
        Integer ct = charSet.getOrDefault(ch, 0) - 1;

        if(ct == -1){
          b = false;
          break;
        }else{
          charSet.put(ch, ct);
        }
      }
    }

    return b;
  }
}
