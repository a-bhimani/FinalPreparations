package finalprep.challenges.leetcode.medium;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author adb
 */
public class Solution260{

  public int[] singleNumber(int[] nums){
    int ix = 0;
    Set<Integer> uSet = new HashSet<>();
    int[] result = new int[2];
    Iterator itr;

    for(int x : nums){
      if(uSet.contains(x)){
        uSet.remove(x);
      }else{
        uSet.add(x);
      }
    }

    itr = uSet.iterator();
    while(itr.hasNext()){
      result[ix] = (int)itr.next();
      ix++;
    }

    return result;
  }
}
