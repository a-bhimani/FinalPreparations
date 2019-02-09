package finalprep.challenges.leetcode.strings.medium;

/**
 *
 * @author adb
 */
public class Solution647{

  public int countSubstrings(String s){
    int sum = 0;

    for(int ix = 0; ix < s.length(); ix++){
      sum += findPalindromes(s, ix, ix);
      sum += findPalindromes(s, ix, ix + 1);
    }

    return sum;
  }

  private int findPalindromes(String s, int leftIx, int rightIx){
    int sum = 0;

    for(; leftIx >= 0 && rightIx < s.length(); leftIx--, rightIx++){
      if(s.charAt(leftIx) != s.charAt(rightIx)){
        return sum;
      }

      sum++;
    }

    return sum;
  }
}
