package finalprep.challenges.leetcode.strings.medium;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author adb
 *
 * Use Kadanes for O(N)
 */
public class Solution3{

  public int lengthOfLongestSubstring(String s){
    int ct = 0, ix = 0, jy = 0;
    Map<Character, Integer> setChars = new HashMap<>();

    while(ix < s.length()){
      char c = s.charAt(ix);

      if(!setChars.containsKey(c)){
        setChars.put(c, ix);
        ix++;
        ct = Math.max(ct, ix - jy);
      }else{
        jy = setChars.get(c) + 1;
        setChars.remove(c);
      }
    }

//    while(ix < s.length()){
//      char c = s.charAt(ix);
//
//      if(!setChars.contains(c)){
//        setChars.add(c);
//        ix++;
//        ct = Math.max(ct, ix - jy);
//      }else{
//        setChars.remove(s.charAt(jy));
//        jy++;
//      }
//    }
//    for(int ix = 0; ix < s.length() - ct; ix++){
//      HashSet<Character> st = new HashSet<>();
//
//      for(int jy = ix; jy < s.length(); jy++){
//        Character c = s.charAt(jy);
//
//        if(st.contains(c)){
//          break;
//        }
//
//        st.add(c);
//      }
//
//      ct = (st.size() > ct) ? st.size() : ct;
//    }
    return ct;
  }
}
