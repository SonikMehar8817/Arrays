

public class Q6_AcendingAndDecending {

    static void arrangeArrayAccending(int [] arr){
        int mid = (arr.length-1)/2;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                if(i<=mid){
                  if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                  }
                }
                else{
                  if(arr[i]<arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                  }
                }
            }
           
        }
        for(int i:arr){
            System.out.print(i+" ");
        }
    
    }

    static void arrangeArrayDecending(int [] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                }
            }
        }
        System.out.println("Decending order");
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int [] arr= {4,2,8,6,15,5,9,20};

        arrangeArrayAccending(arr);
        // arrangArrayDecending(arr);
        
    }
}
