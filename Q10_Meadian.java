import java.util.Arrays;

public class Q10_Meadian {
    static double meadianOfArrayElements(int arr[]){
        Arrays.sort(arr);
        if(arr.length%2!=0){
            return arr[arr.length/2];
        }
        else{
            double d = arr[arr.length/2]+arr[(arr.length/2)-1];
            return d/2;
        }
    }
    public static void main(String[] args) {
        int [] arr ={5,5,7,6,6,5};
        System.out.println(meadianOfArrayElements(arr));
    }
}
