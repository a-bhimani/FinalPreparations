package finalprep.challenges.leetcode.strings.easy;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author adb
 */
public class Solution409{

  public int longestPalindrome(String s){
    int ct = 0;
    Set<Character> setChars = new HashSet<>();

    for(int ix = 0; ix < s.length(); ix++){
      if(setChars.contains(s.charAt(ix))){
        ct += 2;
        setChars.remove(s.charAt(ix));
      }else{
        setChars.add(s.charAt(ix));
      }
    }

    return setChars.size() > 0 ? ct + 1 : ct;
  }
}
