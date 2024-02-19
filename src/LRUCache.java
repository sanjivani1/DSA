import java.util.HashMap;
import java.util.Map;

public class LRUCache {
    //initialize DLL and capacity
    Node head = new Node(0,0); //MRU
    Node tail = new Node(0,0); //LRU
    int capacity;
    Map<Integer , Node> map = new HashMap<>();
    public LRUCache(int capacity) {
        //initailize the capacity
        //do the doubly LinkedList setup
        this.capacity = capacity;
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        if(map.containsKey(key)){
            Node node = map.get(key);
            remove(node);
            add(node);
            return node.val;
        }
        else return -1;
    }

    public void put(int key, int value) {

        //check if the MRU.next == LRU the add new  node in between LRU and MRU and add to the map
        //and decrease size of cache
        //if MRU.next != LRU then connect the new node to MRU and prev node.tail to new Node

        if(map.containsKey(key)){
            remove(map.get(key));
        }
        if(map.size() == capacity){
            remove(tail.prev);
        }
        add(new Node(key,value));
    }

    public void add(Node node){
        //add element to map and add to the DLL
        map.put(node.key, node);
        node.next = head.next;
        node.next.prev = node;
        head.next=node;
        node.prev = head;
    }
    public void remove(Node node){
        map.remove(node.key);
        node.prev.next = node.next;
        node.prev.next.prev = node.prev;
    }
}
class Node{
    int key;
    int val;
    Node next;
    Node prev;
    Node(int key , int val){
        this.key = key;
        this.val = val;
    }
}
