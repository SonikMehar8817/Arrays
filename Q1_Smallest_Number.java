

import java.util.Arrays;
import java.util.Scanner;

public class Q1_Smallest_Number {

    static int smallestNumberInArray(int [] sm){
        // int smallestNumber = Integer.MAX_VALUE;
        // for(int i=0;i<sm.length;i++){
            // if(smallestNumber>sm[i]){
            //    smallestNumber = sm[i];
            // }
        //     smallestNumber=Math.min(smallestNumber, sm[i]);
        // }
   
        // return smallestNumber;


        // by sorting 
        Arrays.sort(sm);
        return sm[0];
    }

   
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of a array :");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter Array elements :");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        System.out.println("Smallest Number is :"+smallestNumberInArray(arr));
    }
}
