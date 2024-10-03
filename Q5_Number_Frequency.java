

import java.util.HashMap;
import java.util.Map;


public class Q5_Number_Frequency {
    public static void main(String[] args) {
        int [] arr= {1,4,2,4,1,4,5};
        countFrequency(arr);
        // for(int i=0;i<arr.length;i++){
        //     System.out.println("The frequency of "+arr[i]+" is :"+numberFrequency(arr, arr[i]));
        // }

        /*-----------------------------By Hash Table--------------------------- */
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the size of the array :");
        // int n = sc.nextInt();
        // int [] arr= new int[n];
        // int max = Integer.MIN_VALUE;
        // for(int i = 0;i<n;i++){
        //     arr[i] = sc.nextInt();
        //     max = Math.max(max, arr[i]);
        // }

        // int size = max +1;
        // int [] hash = new int[size];
        // for(int i=0;i<n;i++){
        //     int index = arr[i];
        //     hash[index]++;
        // }
        // for(int i = 0;i<hash.length;i++){
        //     System.out.println(i+" = "+hash[i]);
        // }
    }

    static void countFrequency(int []arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }
            else{
                map.put(arr[i], 1);
            }
        }
        // System.out.println(map);
       for(Map.Entry<Integer,Integer> entry :map.entrySet()){
           System.out.println(entry.getKey()+" "+entry.getValue());
       }
    }
    /*--------------------------Normal Method------------------------>*/
    // public static int numberFrequency(int arr[],int n){
    //     int count = 0;
    //     for(int i=0;i<arr.length;i++){
    //         if(arr[i]==n){
    //             count++;
    //         }
    //     }
    //     return count;

    // }
}
