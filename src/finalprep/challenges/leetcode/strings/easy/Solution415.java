package finalprep.challenges.leetcode.strings.easy;

/**
 *
 * @author adb
 */
public class Solution415{

  public String addStrings(String num1, String num2){
    boolean toCarry = false;
    StringBuilder sb = new StringBuilder();

    for(int ix = num1.length() - 1, jy = num2.length() - 1; ix >= 0 || jy >= 0 || toCarry; ix--, jy--){
      int n = 0;

      if(ix >= 0 && ix < num1.length()){
        n += Character.getNumericValue(num1.charAt(ix));
      }

      if(jy >= 0 && jy < num2.length()){
        n += Character.getNumericValue(num2.charAt(jy));
      }

      if(toCarry){
        n++;
        toCarry = false;
      }

      toCarry = n > 9;
      n = n % 10;

      sb.insert(0, n);
    }

    return sb.toString();
  }
}
