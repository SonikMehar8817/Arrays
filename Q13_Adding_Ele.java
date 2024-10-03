import java.util.*;
public class Q13_Adding_Ele {
    public static int[] addingElementInAnArray(int []arr,int n){
        int [] arr2 = new int[arr.length+1];
        for(int i=0;i<arr.length;i++){
            arr2[i] = arr[i];
        }
        arr2[arr.length] = n;
  
         return arr2;
    }
    public static void main(String[] args) {
        Integer [] arr = {1,2,3,4};
        List<Integer> list = new ArrayList<>(Arrays.asList(arr));
        list.add(5);
        arr = list.toArray(arr);
        for(int i:arr){
            System.out.println(i);
        }
        // int [] arr = {1,2,3,4};
        // for(int i:arr){
        //     System.out.print(i+" ");
        // }
        // System.out.println();
        // arr = addingElementInAnArray(arr, 5);
        //       for(int i:arr){
        //     System.out.print(i+" ");
        // }
       
    }
}
