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
    
}
