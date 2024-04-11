import java.util.Arrays;

public class sorting {
    public static void main(String[] args) {
        int [] arr={7,8,3,4,6};
        bubbleSortt(arr);
        System.out.println(Arrays.toString(arr));
        
    }
    public static void selectionSort(int[] arr){
        for (int i=0;i<arr.length;i++){
            int ind=i;
            for(int j=i+1;j<nums.length;j++){
                if(arr[j]<arr[ind]){
                    ind=j;
                }
            }
            int temparr[ind];
            arr[ind]=arr[i];
            arr[i]=temp;
        }
    }

    public static void bubbleSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    
}
