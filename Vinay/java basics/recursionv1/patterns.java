package recursionv1;

import java.util.ArrayList;
import java.util.Arrays;

public class patterns {

    public static void main(String[] args) {
       int [] arr={3,1,2};
       ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
       ArrayList<Integer> temp=new ArrayList<>();
       subsequencesumK(0, ans, arr,temp,0,3);
       System.out.println(ans);
       char [] s={'a','v','d'};
       reverseString(s, 0, s.length-1);
       System.out.println(Arrays.toString(s));
    }
    public static void subsequence1(int index,ArrayList<Integer> temp,int [] arr){
        if(index==arr.length){
            System.out.println(temp);
            return;
        }
        temp.add(arr[index]);
        subsequence1(index+1, temp, arr);
        temp.remove(temp.size()-1);
        subsequence1(index+1, temp, arr);
    }

    public static void subsequence2(int index,ArrayList<ArrayList<Integer>> ans,int[] arr,ArrayList<Integer> temp){
        if(index==arr.length){
            ans.add(new ArrayList<>(temp));
            //System.out.println(ans);
            return;

        }
        temp.add(arr[index]);
        subsequence2(index+1, ans, arr, temp);
        temp.remove(temp.size()-1);
        subsequence2(index+1, ans, arr, temp);
    }
    public static void subsequencesumK(int index,ArrayList<ArrayList<Integer>> ans,int[] arr,ArrayList<Integer> temp,int sum,int k){
        if(index==arr.length){
            
            if(sum==k){
                System.out.println(temp);
                ans.add(new ArrayList<>(temp));
            }
            return;
        }
        sum+=arr[index];
        temp.add(arr[index]);
        subsequencesumK(index+1, ans, arr, temp,sum,k);
        temp.remove(temp.size()-1);
        sum-=arr[index];
        subsequencesumK(index+1, ans, arr, temp,sum,k);
    }
    

    public static void reverseString(char [] s,int st,int end){
        if(st>=end){
            return;
        }
        char temp=s[st];
        s[st]=s[end];
        s[end]=temp;
        reverseString(s, st+1, end-1);
    }
}
