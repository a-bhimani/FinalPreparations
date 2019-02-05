package finalprep.challenges.leetcode.strings.medium;

import java.util.Stack;

/**
 *
 * @author adb
 */
public class Solution678{

  public boolean checkValidString(String s){
    int starCt = 0, starCtRev = 0;
    Stack<Character> del = new Stack<>();
    Stack<Character> delRev = new Stack<>();

    for(int ix = 0, jy = s.length() - 1; ix < s.length(); ix++, jy--){
      switch(s.charAt(ix)){
        case '(':
          del.push('(');
          break;
        case ')':
          if(!del.isEmpty() && del.peek() == '('){
            del.pop();
          }else{
            if(starCt > 0){
              starCt--;
            }else{
              return false;
            }
          }
          break;
        case '*':
          starCt++;
          break;
      }

      switch(s.charAt(jy)){
        case ')':
          delRev.push(')');
          break;
        case '(':
          if(!delRev.isEmpty() && delRev.peek() == ')'){
            delRev.pop();
          }else{
            if(starCtRev > 0){
              starCtRev--;
            }else{
              return false;
            }
          }
          break;
        case '*':
          starCtRev++;
          break;
      }
    }

    return del.isEmpty() || (del.size() <= starCt) || (delRev.size() <= starCtRev);
  }
}
