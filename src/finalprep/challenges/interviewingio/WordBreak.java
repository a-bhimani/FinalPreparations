package finalprep.challenges.interviewingio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author adb
 */
public class WordBreak{

  public static List<String> wordBreak(String s, HashSet<String> wordDict){
    int[] can = new int[s.length() + 1];
    HashMap<Integer, Integer> map = new HashMap<>();
    int max = maxWordLength(wordDict);

    // function
    can[0] = 1;
    for(int i = 1; i <= s.length(); i++){

      for(int j = 1; j <= max && j <= i; j++){
        if(can[i - j] == 0){
          continue;
        }

        String sub = s.substring(i - j, i);

        if(wordDict.contains(sub)){
          if(can[i] == 0){
            can[i] = can[i - j] + 1;
            map.put(i, i - j);
          }else if(can[i - j] + 1 < can[i]){
            can[i] = can[i - j] + 1;
            map.put(i, i - j);
          }

        }
      }
    }

    List<String> ans = new ArrayList<>();
    int i = s.length(), j = 0;

    for(int k = 0; k < can[s.length()] - 1; k++){
      j = (int)map.get(i);

      ans.add(s.substring(j, i));
      i = j;
    }

    return ans;
  }

  private static int maxWordLength(Set<String> wordDict){
    int max = 0;

    for(String word : wordDict){
      max = Math.max(max, word.length());
    }

    return max;
  }
}
