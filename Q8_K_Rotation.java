public class Q8_K_Rotation {
    public static void kRotation(int [] arr,int k){
        int n = k%arr.length;
        reverseArray(arr, 0, n-1);
        reverseArray(arr, n, arr.length-1);
        reverseArray(arr, 0, arr.length-1);
    }
    public static void reverseArray(int [] arr,int s,int e){
        while (s<e) {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        kRotation(arr, 2);
        for(int i:arr){
            System.out.println(i);
        }
    }
}
