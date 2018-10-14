package finalprep.challenges.leetcode.strings.easy;

import java.util.HashMap;

/**
 *
 * @author adb
 */
public class Solution290{

  public boolean wordPattern(String pattern, String str){
    String[] arStr;
    HashMap<Character, String> mpPatternA;
    HashMap<String, Character> mpPatternB;

    arStr = str.toLowerCase().split(" ");
    if(arStr.length != pattern.length()){
      return false;
    }
    pattern = pattern.toLowerCase();
    mpPatternA = new HashMap();
    mpPatternB = new HashMap();

    for(int ix = 0; ix < arStr.length; ix++){
      char c = pattern.charAt(ix);

      if(mpPatternA.containsKey(c)){
        if(!mpPatternA.get(c).equals(arStr[ix])){
          return false;
        }
      }else{
        mpPatternA.put(c, arStr[ix]);
      }

      if(mpPatternB.containsKey(arStr[ix])){
        if(!mpPatternB.get(arStr[ix]).equals(c)){
          return false;
        }
      }else{
        mpPatternB.put(arStr[ix], c);
      }
    }

    return true;
  }

  public boolean wordPatternNew(String pattern, String str){
    String[] arStr;
    HashMap<Integer, String> mpPattern;

    arStr = str.toLowerCase().split("\\W");
    if(arStr.length != pattern.length()){
      return false;
    }

    pattern = pattern.toLowerCase();
    mpPattern = new HashMap();

    for(int ix = 0; ix < pattern.length(); ix++){
      int c = pattern.charAt(ix);
      String val = arStr[ix];

      if(mpPattern.containsValue(val)){
        if(!mpPattern.containsKey(c)){
          return false;
        }
      }

      if(!mpPattern.containsKey(c)){
        mpPattern.put(c, val);
      }

      if(!val.equals(mpPattern.get(c))){
        return false;
      }
    }

    return true;
  }
}
