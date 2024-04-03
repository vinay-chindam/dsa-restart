import java.util.Arrays;
import java.util.HashMap;

public class arrayBasic {

    public static void main(String[] args) {
        int [] arr={1,2,3,4,1,1,1};
        gensubarrays(arr);
        
    }

    public static int findMaxConsecutiveOnes(int[] nums) {

        int cnt=0;
        int temp=0;
        
        for (int i : nums){
            if(i==1){
                temp+=1;
            }
            else{
                temp=0;
            }
            cnt=Math.max(temp,cnt);
        }
        return cnt;
        
    }

    public static int singleNumber(int[] nums) {
        int ans=nums[0];
        int n=nums.length;
        for (int i=1;i<n;i++){
            ans=ans^nums[i];
        }
        return ans;
        
    }

    public static void gensubarrays(int[] arr){
        int len=0;
        
        int n=arr.length;
        for(int i=0;i<n;i++){
            int sum=0;
            for (int j=i;j<n;j++){
                sum+=arr[j];
                
            }
            if(sum==3){
                len=Math.max(len, sum);
            }
        }
        System.out.println(len);
    }
 
    

     public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            int rem=target-nums[i];
            if(hm.containsKey(rem)){
                return new int[]{hm.get(rem), i};
            }
            hm.put(nums[i], i);
        }
        return new int[]{-1, -1};
        
    }

    public void nextPermutation(int[] nums) {
        int n=nums.length;
        
        int i=n-2;
        while(i>=0 && nums[i]>=nums[i+1]){
            i--;
        }
        int ind=i;
        if(ind==-1){
            Arrays.sort(nums);
            return;
        }
        int j=n-1;
        while( j>=0 && nums[j]<=nums[ind]){
            j--;
        }
        if(j>=0){
            int temp=nums[j];
            nums[j]=nums[ind];
            nums[ind]=temp;
        }
         revArray(nums,ind+1,n-1);
    }
 
 
    public static void revArray(int[] nums,int st,int end){
        while(st<=end){
            int temp=nums[st];
            nums[st]=nums[end];
            nums[end]=temp;
            st++;
            end--;
            }
        }

        public int majorityElement(int[] nums) {
            int cnt=1;
            int ele=nums[0];
            int n=nums.length;
            int i=1;
            while(i<n){
                if(cnt==0){
                    ele=nums[i];
                    cnt=1;
    
                }
                else{
                    if(ele==nums[i]){
                        cnt+=1;
                    }
                    else{
                        cnt-=1;
                    }
                }
                i++;
            }
            int cnt2=0;
            for(int j :nums){
                if(j==ele){
                    cnt2+=1;
                }
            }
            if(cnt2>n/2){
                return ele;
            }
            return 0;
        }

        public int maxSubArray(int[] nums) {
        
            int n=nums.length;
            int sum=0;
            int maxi=nums[0];
    
    
            for(int i=0;i<n;i++){
                if(sum<0){
                    sum=0;
                }
                sum+=nums[i];
                maxi=Math.max(maxi,sum);
               
            }
            return maxi;
            
        }

        public int maxProfit(int[] prices) {

        
            int n=prices.length;
            
    
            int mini=prices[0];
            int ans = 0;
    
            for (int j=1;j<n;j++){
                mini=Math.min(mini,prices[j]);
                int temp=prices[j]-mini;
                ans=Math.max(temp,ans);
               
            }
            return ans;
    
            
        }
}
