package finalprep.challenges.leetcode.medium;

/**
 *
 * @author adb
 */
public class Solution5{

  public String longestPalindrome(String s){
    String rs = new String();

    for(int ix = 0; ix < s.length(); ix++){
      int jy = ix, kz = ix;
      StringBuilder sb = new StringBuilder();

      while((jy >= 0) && (kz < s.length())){
        if(s.charAt(jy) != s.charAt(kz)){
          break;
        }

        if(jy == kz){
          sb.append(s.charAt(jy));
        }else{
          sb.insert(0, s.charAt(jy));
          sb.append(s.charAt(jy));
        }

        jy--;
        kz++;
      }

      if(sb.length() >= rs.length()){
        rs = sb.toString();
      }

      jy = ix;
      kz = ix + 1;
      sb = new StringBuilder();

      while((jy >= 0) && (kz < s.length())){
        if(s.charAt(jy) != s.charAt(kz)){
          break;
        }

        if(jy == kz){
          sb.append(s.charAt(jy));
        }else{
          sb.insert(0, s.charAt(jy));
          sb.append(s.charAt(jy));
        }

        jy--;
        kz++;
      }

      if(sb.length() >= rs.length()){
        rs = sb.toString();
      }
    }

    return rs;
  }
}
