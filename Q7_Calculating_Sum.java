import java.util.stream.IntStream;

public class Q7_Calculating_Sum {

    static int calculatingSumOfAllElements(int [] arr){
        int sum =0;
        // for(int i=0;i<arr.length;i++){
        //     sum+=arr[i];
        // }
        
        //using collection 
        sum = IntStream.of(arr).sum();
        return sum;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        
        System.out.println(calculatingSumOfAllElements(arr));
    }
}