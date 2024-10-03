

public class Q3_SecSmall_SecLarge {
    public static void main(String[] args) {
        int [] arr = {8,6,2,1};
        System.out.println("Secount smallest number is :"+secSmallestNumber(arr));
        System.out.println("Secount largest number is :"+secLargestNumber(arr));
    }
    static int secSmallestNumber(int [] arr){
        int small = Integer.MAX_VALUE;
        int secSmall = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<small){
                secSmall = small;
                small = arr[i];
            }
            else if(arr[i]<secSmall&&secSmall!=small){
                secSmall = arr[i];
            }
        }
        return secSmall;
    }
    static int secLargestNumber(int [] arr){
        //  int [] arr = {3,6,3,7,8,9,4};
        int Large = Integer.MIN_VALUE;
        int secLarge = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>Large){
                secLarge = Large;
                Large = arr[i];
            }
            else if(arr[i]>secLarge&&secLarge!=Large){
                secLarge = arr[i];
            }
        }
        return secLarge;
    }
}
