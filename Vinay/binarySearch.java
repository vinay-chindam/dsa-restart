public class binarySearch {
    public static void main(String[] args) {
        
    }

    public static int binarySearch(int[] arr,int target,int st,int end){

        int ans=-1;
        while(st<=end){
            int mid=(st+end)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
                end=mid-1;
            }
            else{
                st=mid+1;
        }
        


        }
        return ans;
        
    }

    public static int startIndex(int [] arr,int target,int st ,int end){
        int ans=0;
        while(st<=end){
            int mid=(st+end)/2;
            if(arr[mid]==target){
                ans=mid;
                end=mid-1;
            }
            else if(arr[mid]<target){
                st=mid+1;
                ans=mid+1;
            }
            else{
                end=mid-1;
                ans=mid-1;
                
            }
        }
        return ans;
    }

    public  static int endIndex(int[] arr,int target,int st,int end){
        int ans=st;
        while(st<=end){
            int mid=(st+end)/2;
            if(arr[mid]==target){
                ans=mid;
                st=mid+1;
            }
            else if(arr[mid]<target){
                st=mid+1;
                ans=mid+1;
            }
            else{
                end=mid-1;
                ans=mid-1;
                
            }
            
        }
        return ans;
    }
    
}
