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
    
}
