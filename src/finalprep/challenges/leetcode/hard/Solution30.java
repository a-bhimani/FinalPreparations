package finalprep.challenges.leetcode.hard;

import static java.lang.System.out;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author adb
 */
public class Solution30{

  public List<Integer> findSubstring(String s, String[] words){
    int wordCount = words.length;
    int wordLength = (wordCount > 0) ? words[0].length() : 0;
    List<Integer> toNum = new ArrayList<>();
    long startTime = System.nanoTime();

    for(int ix = 0; ix <= s.length() - (wordCount * wordLength); ix++){
      List<String> matchWords = new ArrayList<>(Arrays.asList(words));

      for(int jy = ix; jy < ix + (wordCount * wordLength); jy += wordLength){
        String word = s.substring(jy, jy + wordLength);

        if(matchWords.contains(word)){
          matchWords.remove(word);
        }else{
          break;
        }
      }

      if(matchWords.isEmpty()){
        toNum.add(ix);
      }
    }

    out.println((System.nanoTime() - startTime) / 1000000);
    return toNum;
  }
}
