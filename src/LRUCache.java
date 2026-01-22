import java.util.LinkedHashMap;
import java.util.Map;

class LRUCache{

    int capacity;
    LruCach<Integer, Integer> map;
    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.map = new  LruCach<>(capacity);
    }
// due to late initialization the capacity is not lode that's why the capacity is 0 and the removeEldestEntry run and remove the Eldest element
//    LruCach<Integer, Integer> map = new  LruCach<>(capacity);
    public int get(int key) {
//        System.out.println(map);
        if(map.get(key) == null){
            return -1;
        }else {
            return map.get(key);
        }
    }

    public void put(int key, int value) {
        map.put(key,value);
    }
}

class LruCach<K,V> extends LinkedHashMap<K, V> {

    int capacity;
    public LruCach(int capacity) {
        super(capacity,0.75f,true);
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > capacity;
    }
}
//["LRUCache", "put", "put", "get", "put", "get", "put", "get", "get", "get"]
//        [[2], [1, 1], [2, 2], [1], [3, 3], [2], [4, 4], [1], [3], [4]]
class Main1{
    public static void main(String[] args){
        LRUCache lruCache = new LRUCache(2);
        lruCache.put(1,1);
        System.out.println("null");
        lruCache.put(2,2);
        System.out.println("null");
        System.out.println(lruCache.get(1));
        lruCache.put(3,3);
        System.out.println("null");
        System.out.println(lruCache.get(2));
        lruCache.put(4,4);
        System.out.println("null");
        System.out.println(lruCache.get(1));
        System.out.println(lruCache.get(3));
        System.out.println(lruCache.get(4));

    }
}