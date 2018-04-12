package finalprep.challenges.leetcode.easy;

/**
 *
 * @author adb
 *
 * O(S):S is sum of all chars in strs
 */
public class Solution14{

  public String longestCommonPrefix(String[] strs){
    int ix = 0;

    if(strs.length > 0 && strs[0] != ""){
      while(1 == 1){
        boolean doBreak = false;
        Character firstChar = null;

        for(int jy = 0; jy < strs.length; jy++){
          if(ix >= strs[jy].length()){
            doBreak = true;
            break;
          }

          if(jy == 0){
            firstChar = strs[0].charAt(ix);
            continue;
          }

          if(strs[jy].charAt(ix) != firstChar){
            doBreak = true;
            break;
          }
        }

        if(doBreak){
          break;
        }

        ix++;
      }
    }else{
      return "";
    }

    return strs[0].substring(0, ix);
  }
}
