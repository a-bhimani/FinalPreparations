package finalprep.challenges.leetcode.strings.easy;

/**
 *
 * @author adb
 */
public class Solution520{

  public boolean detectCapitalUse(String word){
    if(word.length() > 0){
      int c = word.charAt(0);
      byte b = (byte)((c >= 65 && c <= 90) ? 1 : 0);

      if(word.length() > 1){
        c = word.charAt(1);
        b = (b == 1) ? (byte)((c >= 65 && c <= 90) ? 1 : 0) : 0;

        for(int ix = 1; ix < word.length(); ix++){
          c = word.charAt(ix);

          if(b == 0 && !(c >= 97 && c <= 122)){
            return false;
          }

          if(b == 1 && !(c >= 65 && c <= 90)){
            return false;
          }
        }
      }
    }

    return true;
  }
}
