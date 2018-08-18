package finalprep.challenges.leetcode.weekly;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author adb
 */
public class Solution884{

  public String[] uncommonFromSentences(String A, String B){
    Set<String> singleSet = new HashSet<>();
    Set<String> multiSet = new HashSet<>();
    String[] ans;

    this.updateStringSets(A, singleSet, multiSet);
    this.updateStringSets(B, singleSet, multiSet);

    ans = new String[singleSet.size()];
    return singleSet.toArray(ans);
  }

  private void updateStringSets(String S, Set<String> singleSet, Set<String> multiSet){
    for(int ix = 0, jy = -1; ix <= S.length(); ix++){
      if((ix == S.length()) || Character.isSpaceChar(S.charAt(ix))){
        String s = S.substring(jy + 1, ix);

        if(!multiSet.contains(s)){
          if(!singleSet.contains(s)){
            singleSet.add(s);
          }else{
            singleSet.remove(s);
            multiSet.add(s);
          }
        }

        jy = ix;
      }
    }
  }
}
