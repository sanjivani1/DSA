import java.util.ArrayList;

public class SubarrayWithXOR {
    public static void main(String[] args) {
        int[] arr = {4,2,2,6,4};
        System.out.println("--> "+solve(arr , 6));
    }
    public static int solve(int[] A, int B) {

        int res=0;
        for(int i = 0 ; i < A.length ; i++){
            int xor = 0;
            for(int j = i ; j < A.length ; j++){
                xor ^= A[j];
                if(xor == B){
                    res++;
                }
            }
        }
        return res;
    }
}
