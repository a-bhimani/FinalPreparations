package finalprep.challenges.leetcode.strings.easy;

/**
 *
 * @author adb
 */
public class Solution125{

  public boolean isPalindrome(String s){
    int ix = 0, jy = s.length() - 1;

    while(ix < jy){
      while(!isAlphabet(s.charAt(ix)) && ix < jy){
        ix++;
      }

      while(!isAlphabet(s.charAt(jy)) && jy > ix){
        jy--;
      }

      if(!isCharSame(s.charAt(ix), s.charAt(jy))){
        return false;
      }

      ix++;
      jy--;
    }

    return true;
  }

  private boolean isAlphabet(char c){
    int ch = (int)c;
    return (ch >= 48 && ch <= 57) || (ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122);
  }

  private boolean isCharSame(char c1, char c2){
    return Character.toLowerCase(c1) == Character.toLowerCase(c2);
  }
}
