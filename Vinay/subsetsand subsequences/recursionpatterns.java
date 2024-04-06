package Vinay.subsetsand subsequences;

public class recursionpatterns {
    public static void main(String[] args) {
        
    }

    class Solution {
        public List<String> generateParenthesis(int n) {
            List<String> ans=new ArrayList<>();
            parenthesis(0,0,n,"",ans);
            return ans;
            
        }
    
        public static void parenthesis(int o,int c,int n,String st,List<String> ans){
            if(o+c==2*n){
                ans.add(st);
                return;
            }
    
            if(o<n){
                parenthesis(o+1,c,n,st+'(',ans);
            }
            if(c<o){
                parenthesis(o,c+1,n,st+")",ans);
            }
        }
    }

    class Solution {
        public List<List<Integer>> subsets(int[] nums) {
            int n=nums.length;
            List<List<Integer>> ans=new ArrayList<>();
            List<Integer> temp=new ArrayList<>();
            subset(0,temp,ans,n,nums);
            return ans;
            
        }
    
        public static void subset(int ind,List<Integer> temp,List<List<Integer>> ans,int n,int[] nums){
            if(ind==n){
                ans.add(new ArrayList<>(temp));
                return;
            }
            temp.add(nums[ind]);
            subset(ind+1,temp,ans,n,nums);
    
            temp.remove(temp.size()-1);
            subset(ind+1,temp,ans,n,nums);
    
        }
    }
    
}
