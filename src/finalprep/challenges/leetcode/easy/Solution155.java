package finalprep.challenges.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author adb
 */
public class Solution155{

  List<Integer> stk;
  int cursor;

  public void MinStack(){
    this.cursor = -1;
    this.stk = new ArrayList<>();
  }

  public Solution155(){
    this.MinStack();
  }

  public void push(int x){
    this.cursor++;
    this.stk.add(this.cursor, x);
  }

  public void pop(){
    if(this.cursor >= 0){
      this.stk.remove(this.cursor);
      this.cursor--;
    }
  }

  public int top(){
    if(this.cursor >= 0){
      return this.stk.get(this.cursor);
    }

    return 0;
  }

  public int getMin(){
    int min = 0;

    if(this.cursor >= 0){
      min = this.stk.get(this.cursor);

      for(int ix = this.cursor - 1; ix >= 0; ix--){
        int lMin = stk.get(ix);
        if(lMin < min){
          min = lMin;
        }
      }
    }

    return min;
  }
}
