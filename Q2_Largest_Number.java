

import java.util.Arrays;

public class Q2_Largest_Number {
    public static void main(String[] args) {
        int [] arr = {7,11,4,22,5,3};
        System.out.println("Largest element is : "+largestNumber(arr));
    }
    static int largestNumber(int [] arr){
        // int max = arr[0];
        // for(int i=0;i<arr.length;i++){
        //     max = Math.max(max, arr[i]);
        // }
        // return max;
        // By sorting 

        Arrays.sort(arr);
        return arr[arr.length-1];
    }
}
