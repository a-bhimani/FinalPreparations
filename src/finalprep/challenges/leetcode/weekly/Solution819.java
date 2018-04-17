package finalprep.challenges.leetcode.weekly;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author adb
 */
public class Solution819{

  public String mostCommonWord(String paragraph, String[] banned){
    String[] words = paragraph.split("\\W");
    Map<String, Integer> map = new HashMap<>();
    int max = 0;
    String maxString = "";

    for(int ix = 0; ix < words.length; ix++){
      String word = words[ix].toLowerCase();

      if(word.length() > 0 && !contains(word, banned)){
        int currCount = map.getOrDefault(word, 0) + 1;

        map.remove(word);
        map.put(word, currCount);

        if(currCount > max){
          max = currCount;
          maxString = word;
        }
      }
    }

    return maxString;
  }

  public boolean contains(String word, String[] banned){
    for(int ix = 0; ix < banned.length; ix++){
      if(banned[ix].equalsIgnoreCase(word)){
        return true;
      }
    }

    return false;
  }
}
