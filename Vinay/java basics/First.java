public class First{
    public static void main(String[] args) {
    for (int i = 0; i < 10; i++) {
        System.out.println(fib(4));
    }
        
    }
    public static int fib(int n) {
        int first=0;
        int second=1;
        int ans=0;
        int k=2;
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        if(n==2){
            return 1;
        }
        while(k<=n){
            ans=first+second;
            first=second;
            second=ans;
            k++;
        }
        return ans;
        
    }
}   