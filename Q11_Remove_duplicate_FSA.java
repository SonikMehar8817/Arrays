
// import java.util.HashSet;

public class Q11_Remove_duplicate_FSA {
    static void removeDuplicatesFromSortedArray(int [] arr){

        int i=1,j=1;
       while (j<arr.length) {
           if(arr[i]!=arr[j]){
               i++;
               arr[i]=arr[j];
               
           }
           j++;
       }
       for(int k=0;k<=i;k++){
          System.out.println(arr[k]);
       }
         
       
        // HashSet<Integer> set = new HashSet<>();
        // for(int i=0;i<arr.length;i++){
        //     set.add(arr[i]);
        // }

        // for(int i:set){
        //     System.out.println(i);
        // }
        // System.out.println(set);

        // int j=1;
        //  for(int i = 0;i<arr.length-1;i++){
        //     if(arr[i]!=arr[i+1]){
        //         arr[j] = arr[i+1];
        //         j++;
        //     }
        //  }
        //  for(int i=j;i<arr.length;i++){
        //     arr[i] = 0;
        //  }
        //  for(int i:arr){
        //     System.out.println(i);
        //  }
    }
    public static void main(String[] args) {
        int [] arr = {1,2,2,5,5,7,7,7,7,7,7,8,9,9};
        removeDuplicatesFromSortedArray(arr);
    }
}
