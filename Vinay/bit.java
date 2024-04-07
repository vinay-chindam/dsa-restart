package Vinay;

public class bit {
    public static void main(String[] args) {
        
    }
    public int minBitFlips(int start, int goal) {
        int temp=goal ^ start;

        int ans=0;
        while(temp>0){
            if((temp&1)==1){
                ans+=1;
            }
            temp=temp>>1;
        }
        return ans;
        
    }
    public int singleNumber(int[] nums) {
        int ans=nums[0];
        int n=nums.length;
        for (int i=1;i<n;i++){
            ans=ans^nums[i];
        }
        return ans;
        
    }

    public static void subset(List<List<Integer>> ans,int[] nums){

        for (int ind=0;ind<Math.pow(2,nums.length);ind++){
            List<Integer> temp=new ArrayList<>();
            int i=ind;
            int cnt=0;
            while(i>0){
                if((i&1)==1){
                    temp.add(nums[cnt]);
                }
                cnt+=1;
                i=i>>1;
            }
            ans.add(temp);
        }
        
    }
    
}
