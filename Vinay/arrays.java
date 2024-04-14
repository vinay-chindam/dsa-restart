public class arrays {

    public static void main(String[] args) {
        
    }
    public static  List<Integer> majorityElement(int[] nums) {

        int cnt1=0;
        int cnt2=0;
        int ele1=Integer.MIN_VALUE;
        int ele2=Integer.MAX_VALUE;

        int n=nums.length;
        for(int i=0;i<n;i++){
            if(cnt1==0 && nums[i]!=ele2){
                ele1=nums[i];
                cnt1=1;
            }
            else if(cnt2==0 && nums[i]!=ele1){
                ele2=nums[i];
                cnt2=1;
            }
            else if(nums[i]==ele1){
                cnt1++;
            }
            else if(nums[i]==ele2){
                cnt2++;
            }
            else{
                cnt1--;
                cnt2--;
            }
        }

        List<Integer> ans=new ArrayList<Integer>();
        int c1=0;
        int c2=0;
        for(int i:nums){
            if(i==ele1){
                c1++;
            }
            if(i==ele2){
                c2++;
            }

        }
        if(c1>n/3){
            ans.add(ele1);
        }
        if(c2>n/3){
            ans.add(ele2);
        }
        return ans;
        
    }
    
}
