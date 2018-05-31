package finalprep.challenges.leetcode.commons;

/**
 *
 * @author adb
 */
public class ListNode{

  public int val;
  public ListNode next = null;

  private ListNode(){

  }

  public ListNode(int x){
    this.val = x;
  }

  public void PrintR(){
    ListNode node = null;

    System.out.print(val);

    if(this.next != null){
      node = this.next;
    }

    while(node != null){
      System.out.print("->" + node.val);

      if(node.next != null){
        node = node.next;
      }else{
        node = null;
      }
    }
  }
}
