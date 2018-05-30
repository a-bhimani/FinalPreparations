package finalprep.challenges.leetcode.medium;

/**
 *
 * @author adb
 */
public class Solution8{

  public int myAtoi(String str){
    long result = 0;
    boolean isSigned = false;
    boolean isNegative = false;

    for(int ix = 0; ix < str.length(); ix++){
      int c = str.charAt(ix);

      if(c != 32 && c != 43 && c != 45 && !(c >= 48 && c <= 57)){
        return 0;
      }

      if(isSigned){
        if(!(c >= 48 && c <= 57)){
          return 0;
        }
      }

      if(c == 43){
        if(isSigned){
          return 0;
        }

        isSigned = true;
      }

      if(c == 45){
        if(isSigned){
          return 0;
        }

        isSigned = true;
        isNegative = true;
      }

      if(c >= 48 && c <= 57){
        while(ix < str.length() && (str.charAt(ix) >= 48 && str.charAt(ix) <= 57)){
          c = str.charAt(ix) - 48;
          result *= 10;
          result += isNegative ? 0 - c : c;
          ix++;

          if(result < Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
          }

          if(result > Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
          }
        }

        break;
      }
    }

    return (int)result;
  }
}
