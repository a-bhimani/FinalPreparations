package finalprep.challenges.leetcode.strings.easy;

import java.util.Stack;

/**
 *
 * @author adb
 */
public class Solution20{

  public boolean isValid(String s){
    Stack<Character> brStack = new Stack<>();

    for(int ix = 0; ix < s.length(); ix++){
      switch(s.charAt(ix)){
        case '}':
          if(brStack.isEmpty() || brStack.peek() != '{'){
            return false;
          }
          brStack.pop();
          break;
        case ')':
          if(brStack.isEmpty() || brStack.peek() != '('){
            return false;
          }
          brStack.pop();
          break;
        case ']':
          if(brStack.isEmpty() || brStack.peek() != '['){
            return false;
          }
          brStack.pop();
          break;
        default:
          brStack.push(s.charAt(ix));
          break;
      }
    }

    return brStack.size() == 0;
  }
}
