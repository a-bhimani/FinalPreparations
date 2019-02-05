package finalprep.challenges.leetcode.arrays.easy;

import finalprep.challenges.leetcode.commons.ListNode;

/**
 *
 * @author adb
 */
public class Solution707{

  private final int MAX_CAPACITY = 1000;
  private int[] linkedList;
  private int size;

  /**
   * Initialize your data structure here.
   */
  public Solution707(){
    linkedList = new int[MAX_CAPACITY];
  }

  public void printR(){
    if(size == 0){
      System.out.println("{}");
      return;
    }

    for(int ix = 0; ix < size; ix++){
      System.out.print((ix > 0 ? " -> " : "") + linkedList[ix]);
    }

    System.out.println();
  }

  /**
   * Get the value of the index-th node in the linked list. If the index is invalid, return -1.
   */
  public int get(int index){
    if(size < (index + 1)){
      System.out.println("{" + index + ":NaN}");
      return -1;
    }

    System.out.println("{" + index + ":" + linkedList[index] + "}");
    return linkedList[index];
  }

  /**
   * Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node
   * of the linked list.
   */
  public void addAtHead(int val){
    addAtIndex(0, val);
  }

  /**
   * Append a node of value val to the last element of the linked list.
   */
  public void addAtTail(int val){
    addAtIndex(size, val);
  }

  /**
   * Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node
   * will be appended to the end of linked list. If index is greater than the length, the node will not be inserted.
   */
  public void addAtIndex(int index, int val){
    if(index > size){
      return;
    }

    for(int ix = size; ix > index; ix--){
      linkedList[ix] = linkedList[ix - 1];
    }

    linkedList[index] = val;
    size++;
  }

  /**
   * Delete the index-th node in the linked list, if the index is valid.
   */
  public void deleteAtIndex(int index){
    if(size < (index + 1)){
      return;
    }

    for(int ix = index + 1; ix < size; ix++){
      linkedList[ix - 1] = linkedList[ix];
    }

    size--;
  }
}

/**
 * Your MyLinkedList object will be instantiated and called as such: MyLinkedList obj = new MyLinkedList(); int param_1 =
 * obj.get(index); obj.addAtHead(val); obj.addAtTail(val); obj.addAtIndex(index,val); obj.deleteAtIndex(index);
 */
