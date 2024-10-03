import java.util.*;
public class Q14_Repeation_Ele {
    public static void  findingAllRepeationEle(int [] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                System.out.println(arr[i]);
            }
            else{
                map.put(arr[i], 1);
            }
        }

        // Arrays.sort(arr);
        // for(int i = 0;i<arr.length-1;i++){
        //     if(arr[i]==arr[i+1]){
        //         System.out.println(arr[i]);
        //     }
        // }
        // List<Integer> ans = new ArrayList<>();
        // for(int i=0;i<arr.length;i++){
        //     for(int j=i+1;j<arr.length;j++){
        //         if(arr[i]==arr[j]){
        //             boolean cheak=true;
        //             for(int k=0;k<ans.size();k++){
        //                 if(arr[i]==ans.get(k)){
        //                     cheak = false;
        //                 }
        //             }
        //             if (cheak) {
        //                 System.out.println(arr[i]);
        //                 ans.add(arr[i]);
        //             }
        //         }
        //     }
        // }
    }
    public static void main(String[] args) {
        int [] arr= {1,1,2,2,3,3,4};
        findingAllRepeationEle(arr);
    }
}
