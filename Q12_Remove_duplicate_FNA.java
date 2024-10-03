

import java.util.HashSet;

public class Q12_Remove_duplicate_FNA {

    static void removeDuplicatesFromUnSortedArray(int [] arr){
       
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        for(int i:set){
            System.out.println(i);
        }
        // int i=0;
        // for(int j=0;j<arr.length;j++){
        //     int count = 0;
        //     for(int k=0;k<i;k++){
        //         if(arr[j]==arr[k]){
        //             count++;
        //         }
        //     }
        //     if(count==0){
        //         arr[i]=arr[j];
        //         i++;
        //     }
            
        // }
        // for(int j = 0;j<i;j++){
        //     System.out.println(arr[j]);
        // }
    }
public static void main(String[] args){
    int [] arr= {3,5,4,3,6,5,4,3,56,4,5,4,3};
    //3,5,4,6,56,
    removeDuplicatesFromUnSortedArray(arr);
}
}