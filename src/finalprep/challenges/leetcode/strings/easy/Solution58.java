package finalprep.challenges.leetcode.strings.easy;

/**
 *
 * @author adb
 */
public class Solution58{

  public int lengthOfLastWord(String s){
    int ix = s.length() - 1;
    int str_length = 0;

    while(ix >= 0 && Character.isSpaceChar(s.charAt(ix))){
      ix--;
    }

    while(ix >= 0 && !Character.isSpaceChar(s.charAt(ix))){
      str_length++;
      ix--;
    }

    return str_length;
  }
}
