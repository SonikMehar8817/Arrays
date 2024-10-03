
public class Q4_Reverse_The_Array {
    public static void main(String[] args) {
       int [] arr = {1,2,3,4,5};
       reverseTheArray(arr,0,arr.length-1);
       printArray(arr);
    }

    static void reverseTheArray(int [] arr,int start,int end){
       if(start<end){
          int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverseTheArray(arr, start+1, end-1);
       }
   
    }
    static void printArray(int [] arr){
        for(int i:arr){
            System.out.println(i);
        }
    }
    // public static int reverseTheArray(int [] arr,int n){
    //     // int i=0,j=arr.length-1;
    //     // while (i<j) {
    //     //     int temp = arr[i];
    //     //     arr[i] = arr[j];
    //     //     arr[j] = temp;
    //     //     i++;
    //     //     j--;
    //     // }
    //     // for(int k:arr){
    //     //     System.out.println(k);
    //     // }
    //     if(n==1){
    //         return 0;
    //     }
    //     return arr[]
    // }
}
