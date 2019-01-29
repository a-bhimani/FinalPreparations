package finalprep.challenges.leetcode.strings.weekly;

/**
 *
 * @author adb
 */
public class Solution848{

  public String shiftingLetters(String S, int[] shifts){
    StringBuilder sb = new StringBuilder(shifts.length);
    long[] lshifts = new long[shifts.length];
    long jy = 0;

    for(int ix = shifts.length - 1; ix >= 0; ix--){
      lshifts[ix] = jy + shifts[ix];
      jy = lshifts[ix];
    }

    for(int ix = 0; ix < S.length(); ix++){
      sb.append((char)(((((int)S.charAt(ix)) - 97 + lshifts[ix]) % 26) + 97));
    }

    return sb.toString();
  }
}
