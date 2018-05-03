package finalprep.challenges.leetcode.easy;

import finalprep.sorting.Sorter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Stack;

/**
 *
 * @author adb
 */
public class Solution345{

  public String reverseVowels(String s){
    char[] car = s.toCharArray();
    HashSet<Character> cSet = new HashSet<>(Arrays.asList(new Character[]{'a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U'}));
    Stack<Character> stkCar = new Stack<>();

    for(int ix = 0; ix < car.length; ix++){
      if(cSet.contains(car[ix])){
        stkCar.push(car[ix]);
      }
    }

    for(int ix = 0; ix < car.length; ix++){
      if(cSet.contains(car[ix])){
        car[ix] = stkCar.pop();
      }
    }

    return new String(car);
  }
}
