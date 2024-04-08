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

    public static int findXOR(int L, int R){
        // Write your code here.
       // 1 =1  2= n+1 3=0 4=n
       int s1=xor(L-1);
       int s2=xor(R);
       return s1^s2;

       
    }
    public static int xor(int n){
        if(n%4==0){
            return n;
        }
         if(n%4==1){
            return 1;
        }
         if(n%4==2){
            return n+1;
        }
         if(n%4==3){
            return 0;
        }
        return 0;
    }

    public int countPrimes(int n) {
        if(n<=1){
            return 0;
        }

        boolean [] ref=new boolean[n+1];
        ref[0]=false;
        ref[1]=false;

        for(int i=2;i<n;i++){
            ref[i]=true;
        }

        for(int i=2;i<=(int)Math.sqrt(n);i++){
            if(ref[i]){
                for(int j=i*i;j<=n;j=i+j){
                    ref[j]=false;
                }
            }
        }
        int cnt=0;
        for(boolean i: ref){
            if(i){
                cnt+=1;
            }
        }
                 
           
           return cnt;

        
        
    }


    public static List< Integer > printDivisors(int n) {
        // Write your code here
        List<Integer> ans=new ArrayList<>();
        for(int i=1;i<=(int)Math.sqrt(n);i++){
            if(n%i==0){
                ans.add(i);
                if(i*i!=n){
                    ans.add(n/i);
                }
            }

        }
        Collections.sort(ans);
        return ans;
    }

    public static List< Integer > countPrimes(int n) {
        // Write your code here.
        List<Integer> ans=new ArrayList<>();

        boolean [] ref=new boolean[n+1];
        ref[0]=false;
        ref[1]=false;

        for(int i=2;i<n;i++){
            ref[i]=true;
        }

        for(int i=2;i<=(int)Math.sqrt(n);i++){
            if(ref[i]){
                for(int j=i*i;j<=n;j=i+j){
                    ref[j]=false;
                }
            }
        }

        for(int i=2;i<n;i++){
            if(ref[i]){
                if(n%i==0){
                    ans.add(i);
                }
            }
        }
        
        return ans;
    }
    
}
