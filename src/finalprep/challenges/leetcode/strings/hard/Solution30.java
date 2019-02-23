package finalprep.challenges.leetcode.strings.hard;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author adb
 */
public class Solution30{

  public List<Integer> findSubstring(String s, String[] words){
    int totalLength = 0;
    List<Integer> lstInd = new LinkedList<>();
    Map<String, Integer> setWords = new LinkedHashMap<>();

    if(s.length() == 0 || words.length == 0){
      return lstInd;
    }

    for(int ix = 0; ix < words.length; ix++){
      setWords.put(words[ix], setWords.getOrDefault(words[ix], 0) + 1);
      totalLength += words[ix].length();
    }

    for(int ix = 0; ix < s.length() - (totalLength - 1); ix++){
      if(isWordsShadow(s.substring(ix, ix + totalLength), new LinkedHashMap(setWords))){
        lstInd.add(ix);
      }
    }

    return lstInd;
  }

  private boolean isWordsShadow(String s, Map<String, Integer> words){
    StringBuilder sb = new StringBuilder(s);

    for(String w : words.keySet()){
      int ct = words.get(w);

      while(ct > 0){
        if(sb.indexOf(w) >= 0){
          sb.replace(sb.indexOf(w), sb.indexOf(w) + w.length(), "");
        }
        ct--;
      }
    }

    return sb.length() == 0;
  }
}
