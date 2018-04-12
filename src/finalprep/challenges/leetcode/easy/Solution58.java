package finalprep.challenges.leetcode.easy;

/**
 *
 * @author adb
 */
public class Solution58{

  public int lengthOfLastWord(String s){
    int str_length = 0;

    for(int ix = s.length() - 1; ix >= 0; ix--){
      if(s.charAt(ix) == ' '){
        if(str_length > 0){
          break;
        }else{
          str_length--;
        }
      }

      str_length++;
    }

    return str_length;
  }
}
