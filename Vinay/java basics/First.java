public class First{
    public static void main(String[] args) {
    for (int i = 0; i < 10; i++) {
        System.out.println(fib(4));
    }
    System.out.println(reverse(1534236469));
        
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


    public static int reverse(int x) {
        int ans=0;
        int temp=x;
        if(temp<0){
            temp=temp*-1;
        }

        while(temp>0){
            if ((x >= 0 && ans > Integer.MAX_VALUE / 10) || (x < 0 && -ans < Integer.MIN_VALUE / 10)) {
                return 0;
            int rem=temp%10;
            ans=ans*10;
            ans=ans+rem;
            temp=temp/10;
        }
        if(x<0){
            return -1*ans;
        }
        return ans;
    }
}   