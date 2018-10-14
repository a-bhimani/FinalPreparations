package finalprep.challenges.leetcode.strings.weekly;

/**
 *
 * @author adb
 */
public class Solution848{

  public String shiftingLetters(String S, int[] shifts){
    StringBuilder sb = new StringBuilder();
    int sl = sb.length();

    for(int ix = 0; ix < shifts.length; ix++){
      for(int jy = 0; jy < ((ix < sl) ? ix + 1 : sl); jy++){
        int kz = shifts[ix] * ((ix > sl) ? (ix / sl) + ((ix % sl > (jy + 1)) ? 1 : 0) : 1);
        int c = sb.charAt(jy);

        c = ((((c - 97) + kz) % 26) + 97);
        sb.setCharAt(jy, (char)c);
      }
    }

    return sb.toString();
  }
}
