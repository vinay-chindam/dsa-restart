import java.util.ArrayList;
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

    public static void mergeSort(int [] arr,int low,int high){
        if(low>=high){
            return;
        }
        int mid=(low+high)/2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid+1, high);
        merge(arr,low,mid,high);
    }

    public static void insertionSort(int[] arr){

        for(int i=1;i<arr.length;i++){
            for(int j=i;j>0;j--){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
    }

    public static void merge(int [] arr,int low,int mid,int high){
        ArrayList<Integer> temp=new ArrayList<>();
        int left=low;
        int right=mid+1;
        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                temp.add(arr[left]);
                left++;
            }
            else{
                temp.add(arr[right]);
                right++;
            }
        }
        while(left<=mid){
            temp.add(arr[left]);
            left++;
        }
        while(right<=high){
            temp.add(arr[right]);
            right++;
        }
        for(int i=low;i<=high;i++){
            arr[i]=temp.get(i-low);


        }
    }
    
}
