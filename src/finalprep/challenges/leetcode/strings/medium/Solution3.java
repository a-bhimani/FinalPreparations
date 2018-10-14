package finalprep.challenges.leetcode.strings.medium;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author adb
 *
 * Use Kadanes for O(N)
 */
public class Solution3{

  public int lengthOfLongestSubstring(String s){
    int ct = 0;

    for(int ix = 0; ix < s.length() - ct; ix++){
      HashSet<Character> st = new HashSet<>();

      for(int jy = ix; jy < s.length(); jy++){
        Character c = s.charAt(jy);

        if(st.contains(c)){
          break;
        }

        st.add(c);
      }

      ct = (st.size() > ct) ? st.size() : ct;
    }

    return ct;
  }
}
