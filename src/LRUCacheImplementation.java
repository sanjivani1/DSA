public class LRUCacheImplementation {
    public static void main(String[] args) {
        LRUCache l1 = new LRUCache(3);
        l1.put(1,1);
        l1.put(2,2);
        System.out.println(l1.get(1));
        l1.put(3,3);
        System.out.println(l1.get(2));
        l1.put(4,4);
        System.out.println(l1.get(1));
        System.out.println(l1.get(3));
        System.out.println(l1.get(4));
    }
}
