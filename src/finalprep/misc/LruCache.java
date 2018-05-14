package finalprep.misc;

import java.util.Iterator;
import java.util.LinkedHashMap;

/**
 *
 * @author adb
 */
public class LruCache{

  private int capacity;
  private LinkedHashMap<Integer, Integer> cache;

  public LruCache(int capacity){
    this.capacity = capacity;
    this.cache = new LinkedHashMap<>();
  }

  public int get(int key){
    Integer val = -1;

    if(cache.containsKey(key)){
      val = cache.get(key);
      cache.remove(key);
      cache.put(key, val);
    }

    return val;
  }

  public void put(int key, int val){
    if(cache.containsKey(key)){
      cache.remove(key);
    }

    if(cache.size() == capacity){
      Iterator itr = cache.keySet().iterator();

      if(itr.hasNext()){
        cache.remove((Integer)itr.next());
      }
    }

    cache.put(key, val);
  }
}
