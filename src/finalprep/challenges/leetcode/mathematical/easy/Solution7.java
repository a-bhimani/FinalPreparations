package finalprep.challenges.leetcode.mathematical.easy;

/**
 *
 * @author adb
 */
public class Solution7{

  public int reverse(int x){
    long reversed = 0;

    while(x != 0){
      reversed = reversed * 10 + x % 10;
      x = x / 10;
    }

    return (reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) ? 0 : (int)reversed;

//    long reversed = Long.parseLong(new StringBuffer(Long.toString(x).replace("-", "")).reverse().toString()) * ((x < 0) ? -1 : 1);
//    return (reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) ? 0 : (int)reversed;
  }

}
