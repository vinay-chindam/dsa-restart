import java.util.Arrays;
import java.util.Scanner;

public class First{
    public static void main(String[] args) {
    
        int [] arr=new int[5];
        initArray(arr);
        System.out.println(Arrays.toString(arr));
        
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
            }
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


    public static void switchCase(String fruit){
        switch(fruit){
            case "Apple":
                System.out.println("this is apple");
                break;
            case "Mango":
                System.out.println("this is Mango");
                break;
            case "Grape":
                System.out.println("this is Grape");
                break;
            default:
                System.out.println("please enter valid input");
        }
    }



    
    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for (int i = 2; i*i < n; i++) {
            if(n%i==0 ){
                return false;
            }
            
        }
        return true;
    }

    public static void initArray(int [] arr){
        Scanner in=new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i]=in.nextInt();
            
        }
        
    }

    
}   
