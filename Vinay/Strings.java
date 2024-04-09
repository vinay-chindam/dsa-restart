public class Strings {
    public static void main(String[] args) {
        
    }

    public String removeOuterParentheses(String s) {

        int i=0;
        int j=1;
        int n=s.length();
        int cnt=0;
        String ans="";

        while(i<n){
            if(s.charAt(i)=='('){
                cnt+=1;

            }
            else{
                cnt-=1;
            }
            if(cnt==0){
                for(int k=j;k<i;k++){
                    ans+=s.charAt(k);
                }
                j=i+1;
                continue;
            }
            i+=1;
        }  
        return ans;

    }

    public String reverseWords(String s) {

        int n=s.length();
        String ans="";
        for(int i=0;i<n;i++){
            if(s.charAt(i)==' '){
                continue;
            }
            String temp="";
            int j=i;
            while(j<n && s.charAt(j)!=' '){
                temp+=s.charAt(j);
                j++;
            }
            ans=" "+temp+ans;
            i=j;
        }
        return ans.substring(1);
        
    }
    public String longestCommonPrefix(String[] strs) {

        int minlen=lenCheck(strs);
        int n=strs.length;
        System.out.println(minlen);

        int ans=Integer.MAX_VALUE;
        for(int m=0;m<n;m++){
            ans=Math.min(ans,prefix(m,strs,minlen));
            System.out.println("ans is"+ans);

        }
        
        return strs[0].substring(0,ans);





        
    }
    public static int lenCheck(String[] strs){
       
        int leng=Integer.MAX_VALUE;
        for (String i : strs){
            leng=Math.min(leng,i.length());
        }
        return leng;

    }
    public static int prefix(int i,String[] strs,int minlen){
        String ref=strs[0];
        int cnt=0;
        for(int l=0;l<minlen;l++){
            if(ref.charAt(l)!=strs[i].charAt(l)){
                return cnt;

            }
            else{
                cnt+=1;
            }
        }
       return cnt;

    }

    
        
    
    
}
