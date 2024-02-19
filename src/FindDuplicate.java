public class FindDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,2};

        System.out.println("--> "+findDuplicate(arr));
    }

    private static int findDuplicate(int[] arr) {

        for(int i = 0 ; i< arr.length ; i++){

            if(arr[Math.abs(arr[i])] < 0){
                return Math.abs(arr[i]);
            }
            arr[Math.abs(arr[i])] = - arr[Math.abs(arr[i])];
        }
        return -1;
    }
}
