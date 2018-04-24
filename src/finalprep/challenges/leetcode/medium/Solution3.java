package finalprep.challenges.leetcode.medium;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author adb
 */
public class Solution3{

  public int lengthOfLongestSubstring(String s){
    int ct = 0;
    HashSet<Character> st = new HashSet<>();

    for(int ix = 0; ix < s.length(); ix++){
      Character c = s.charAt(ix);

      if(st.contains(c)){
        st.clear();
      }

      st.add(c);
      ct = (st.size() > ct) ? st.size() : ct;
    }

    return ct;
  }
}
