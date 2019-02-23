package finalprep.challenges.leetcode.strings.easy;

/**
 *
 * @author adb
 *
 * O(S):S is sum of all chars in strs
 */
public class Solution14{

  public String longestCommonPrefix(String[] strs){
    if(strs.length == 0){
      return "";
    }

    boolean doBreak = false;
    int ix = 0;

    for(ix = 0; ix < strs[0].length(); ix++){
      char c = strs[0].charAt(ix);

      for(int jy = 1; jy < strs.length; jy++){
        char c2;

        if(ix >= strs[jy].length()){
          doBreak = true;
          break;
        }

        c2 = strs[jy].charAt(ix);

        if(c != c2){
          doBreak = true;
          break;
        }
      }

      if(doBreak){
        break;
      }
    }

    return strs[0].substring(0, ix);
  }
}
