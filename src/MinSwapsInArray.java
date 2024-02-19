import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

public class MinSwapsInArray {
    public static void main(String[] args) {
        int[] arr = {2,8,4,8};
        int n = arr.length;

        System.out.println("Minimum count = "+count(arr,n));
//        HashMap<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < n; i++) {
//            map.put(arr[i], i);
//        }
//
//        int swaps = 0;
//        for (int i = 0; i < n; i++) {
//            // Check if the current element is at its correct position
//            if (arr[i] != i + 1) {
//                int correctValue = i + 1;
//
//                // Swap the current element with the one at its correct position
//                swap(arr, i, map.get(correctValue));
//                swap(map, arr[i], correctValue);
//
//                swaps++;
//            }
//        }
//
//        System.out.println("Minimum number of swaps needed: " + (swaps+1));
    }

    private static Integer count(int[] arr, int n) {
        int count = 0;
        ArrayList<Pair<Integer,Integer>> list = new ArrayList<>();
        for(int i = 0 ; i < n ; i++){
            list.add(new Pair<>(arr[i] , i));
        }

        list.sort(Comparator.comparing(Pair::getKey));

            Pair<Integer ,Integer> pair = list.get(0);
            int temp;
            while(pair.getValue() != 0){
                temp = pair.getValue();
                Pair<Integer ,Integer> pair2 = list.get(temp);
                swap(list , 0, temp);
                count++;
                pair = list.get(0);
            }
        return count;
    }
    private static void swap(ArrayList<Pair<Integer, Integer>> list, int index1, int index2) {
        Pair<Integer, Integer> pair1 = list.get(index1);
        Pair<Integer, Integer> pair2 = list.get(index2);

        // Swap the values inside the pairs
        Pair<Integer, Integer> temp = new Pair<>(pair1.getKey(), pair1.getValue());
        pair1 = new Pair<>(pair2.getKey(), pair2.getValue());
        pair2 = temp;

        // Update the list with the modified pairs
        list.set(index1, pair1);
        list.set(index2, pair2);
    }

//    private static void swap(HashMap<Integer, Integer> map, int k1, int k2) {
//        Integer v1 = map.get(k1);
//        Integer v2 = map.get(k2);
//
//        map.put(k1, v2);
//        map.put(k2, v1);
//    }
}
class Pair<K , V>{
    private K Key;
    private V Value;

    public Pair(K key , V value){
        this.Key = key;
        this.Value = value;
    }

    public K getKey() {
        return Key;
    }

    public V getValue() {
        return Value;
    }
}
