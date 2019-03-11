package finalprep.challenges.leetcode.strings.medium;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author adb
 */
public class Solution139{

  public boolean wordBreak(String s, List<String> wordDict){
    return stringDfs(s, 0, new HashSet<String>(wordDict), new HashSet<Integer>());
  }

  private boolean stringDfs(String s, int i, Set<String> words, Set<Integer> cache){
    if(words.contains(s.substring(i))){
      return true;
    }

    if(cache.contains(i)){
      return false;
    }

    for(int ix = i; ix < s.length(); ix++){
      if(words.contains(s.substring(i, ix + 1))){
        if(stringDfs(s, ix + 1, words, cache)){
          return true;
        }
      }
    }

    cache.add(i);
    return true;
  }
}
