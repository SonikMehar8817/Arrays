public class Q9_Average {

    static float averageOfAllElements(float [] arr){
        float size = arr.length;
        float sum = 0;
        for(int i=0;i<size;i++){
             sum+=arr[i];
        }
        return sum/size;
    }
    public static void main(String[] args) {
        float [] arr = {1,2,3,4,5};
        System.out.println(averageOfAllElements(arr));
    }
}
