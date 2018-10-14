package finalprep.challenges.leetcode.strings.easy;

/**
 *
 * @author adb
 *
 * Big O: N/2
 */
public class Solution344{

  public String reverseString(String s){
    char[] str_reverse = s.toCharArray();

    for(int ix = 0, jy = str_reverse.length - 1; ix < str_reverse.length / 2; ix++, jy--){
      char res = str_reverse[ix];
      str_reverse[ix] = str_reverse[jy];
      str_reverse[jy] = res;
    }

    return new String(str_reverse);
  }
}
