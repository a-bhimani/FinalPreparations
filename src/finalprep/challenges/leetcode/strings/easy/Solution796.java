package finalprep.challenges.leetcode.strings.easy;

/**
 *
 * @author adb
 */
public class Solution796{

  public boolean rotateString(String A, String B){
    if(A.length() != B.length()){
      return false;
    }

    if(A.length() == 0){
      return true;
    }

    for(int ix = 0; ix < A.length(); ix++){
      if(A.charAt(ix) == B.charAt(0)){
        boolean t2 = true;

        for(int jy = 0; jy < B.length(); jy++){
          if(B.charAt(jy) != A.charAt((ix + jy) % A.length())){
            t2 = false;
          }
        }

        if(t2){
          return t2;
        }
      }
    }

    return false;
  }
}
