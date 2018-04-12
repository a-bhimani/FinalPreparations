package finalprep.challenges.leetcode.easy;

/**
 *
 * @author adb
 *
 * Brute Force O(M.N), KMP O(M+N)
 */
public class Solution28{

  public int strStr(String haystack, String needle){
    int index = -1;

    for(int ix = 0; ix < haystack.length() - (needle.length() - 1); ix++){
      boolean matches = true;
      int thisIndex = ix;

      for(int jy = 0; jy < needle.length(); jy++, thisIndex++){
        matches = !(needle.charAt(jy) == haystack.charAt(thisIndex));

        if(!matches){
          break;
        }
      }

      if(matches){
        index = ix;
        break;
      }
    }

    return index;
  }
}
