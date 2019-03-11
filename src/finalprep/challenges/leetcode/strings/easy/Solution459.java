package finalprep.challenges.leetcode.strings.easy;

/**
 *
 * @author adb
 */
public class Solution459{

  public boolean repeatedSubstringPattern(String s){
    int n = s.length();

    for(int ix = 1; ix < n; ix++){
      boolean t = true;
      boolean inCheck = false;

      if(n % ix == 0){
        int b = 0;
        int l = n / ix;
        int g = ix;
        String test = "";

        inCheck = true;

        while(g >= 1){
          System.out.println(s.substring(b, b + l));

          if(b == 0){
            test = s.substring(b, b + l);
          }else{
            if(!test.equals(s.substring(b, b + l))){
              t = false;
            }
          }

          g--;
          b += l;
        }
      }

      if(t && inCheck){
        return true;
      }
    }

    return false;
  }
}
