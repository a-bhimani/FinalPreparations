package finalprep.misc;

import java.util.Stack;

/**
 *
 * @author adb
 */
public class StockSpanning{

  public static int[] calculateSpan(int prices[]){
    Stack<Integer> stkDiff = new Stack<>();
    int[] arrSpan = new int[prices.length];

    if(prices.length > 0){
      stkDiff.push(0);
      arrSpan[0] = 1;

      for(int ix = 1; ix < prices.length; ix++){
        while(!stkDiff.isEmpty() && prices[stkDiff.peek()] <= prices[ix]){
          stkDiff.pop();
        }

        arrSpan[ix] = stkDiff.isEmpty() ? (ix + 1) : (ix - stkDiff.peek());
        stkDiff.push(ix);
      }
    }

    return arrSpan;
  }
}
