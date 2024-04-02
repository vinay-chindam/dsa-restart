

import java.util.Arrays;


public static void swap(int i,int j,int [] nums){
    int t=nums[i];
    nums[i]=nums[j];
    nums[j]=t;
}
public static void moveZeroes(int[] nums) {
    int i=0;
    int j=1;
    int n=nums.length;
    while(i<n && j<n){
        if(nums[i]==0 && nums[j]==0){
            j++;
        }
        else if(nums[i]==0 && nums[j]!=0){
            swap(i,j,nums);
            i++;
            j++;
        }
        else if(nums[i]!=0 && nums[j]!=0){
            // swap(i,j,nums);
            i++;
            j++;
        }
        else{
            i++;
        }
    }
    
}
public class MoveZerosToEnd {
    public static void main(String[] args) {g
        
        int [] nums={1,0,3,0,0,2,6,46,8};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
    
}
