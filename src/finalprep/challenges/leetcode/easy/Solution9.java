package finalprep.challenges.leetcode.easy;

/**
 *
 * @author adb
 */
public class Solution9{

  public boolean isPalindrome(int x){
    int reverse = 0;

    if(x < 0 || (x % 10 == 0 && x != 0)){
      return false;
    }

    while(x > reverse){
      reverse = (reverse * 10) + (x % 10);
      x /= 10;
    }

    return x == reverse || x == (reverse / 10);
  }
}
