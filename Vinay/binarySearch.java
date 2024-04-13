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
    public static int  findmin(int[] arr){
        int st=0;
        int end=arr.length-1;
        int ans=Integer.MAX_VALUE;
        while(st<=end){
            int mid=(st+end)/2;
            if(arr[st]<=arr[mid]){
                ans=Math.min(ans,arr[st]);
                st=mid+1;
            }
            else{
                ans=Math.min(ans,arr[mid]);
                end=mid-1;
            }
        }
        return ans;
    }
    

    public static int rotatedSearch(int []arr,int target){
        int st=0;
        int end=arr.length-1;
        while(st<=end){
            int mid=(st+end)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[st]<=arr[mid]){
                if(arr[st]<=target && target<=arr[mid]){
                    end=mid-1;
                }
                else{
                    st=mid+1;
                }
            }
            else{
                if(arr[mid]<=target && target<=arr[end]){
                    st=mid+1;
                        
                }
                else{
                    end=mid-1;
                }
                
            }
        }
        return -1;
    }
    public int singleNonDuplicate(int[] nums) {
        int left=0;
        int right=nums.length-1;
        int n=nums.length;
        if(n==1){
            return nums[0];
        }
        if(nums[n-1]!=nums[n-2]){
            return nums[n-1];
        }
        left=1;
        right=n-2;
        while(left<=right){
            int mid=(left+right)/2;
            if(nums[mid]!=nums[mid-1]  && nums[mid]!=nums[mid+1]){
                return nums[mid];
            }
            else if(mid%2==0){
                if(nums[mid]==nums[mid+1]){
                    left=mid+1;
                }
                else{
                    right=mid-1;
                }
            }
            else{
                if(nums[mid]==nums[mid-1]){
                    left=mid+1;
                }
                else{
                    right=mid-1;
                }
            }
        }
        return nums[0];
    }

    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int n=piles.length;
        int st=1;
        int end=piles[n-1];
        int ans=end;


        while(st<=end){
            int mid=(st+end)/2;
            int temp=func(piles,h,mid,n);
            if(temp<=h){
                ans=mid;
                end=mid-1;
            }
            else{
                st=mid+1;
                
            }

        }
        return ans;
        
    }

    public static int  func(int[] piles,int h,int mid,int n){
        int c1=0;
        for(int i=0;i<n;i++){
            c1+=piles[i]/mid;
            if(piles[i]%mid!=0){
                c1++;
            }

        }
        return c1;
    }

    public int smallestDivisor(int[] nums, int threshold) {
        Arrays.sort(nums);
        int n=nums.length;
        int st=1;
        int end=nums[n-1];
        int ans=binarySearch(nums,st,end,threshold);
        return ans;
        
    }

    public static int binarySearch(int[] nums,int st,int end,int threshold){
        int ans2=threshold;
        while(st<=end){
            int mid=(st+end)/2;
            int temp2=check(nums,mid);
            if(temp2<=threshold){
                ans2=mid;
                end=mid-1;
            }
            else{
                st=mid+1;
            }
        }
        return ans2;
    }

    public static int  check(int[] nums,int mid){
        int temp=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%mid==0){
                temp+=nums[i]/mid;
            }
            else{
                temp+=nums[i]/mid;
                temp++;
            }

        }
        return temp;
    }
}
