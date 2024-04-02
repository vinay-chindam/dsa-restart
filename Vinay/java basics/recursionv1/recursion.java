package recursionv1;

import java.util.Arrays;

/**
 * recursion
 */
public class recursion {
    public static void main(String[] args) {
        //func("Vinay", 1);
        //func5(1, 100);
        //int ans=fact(7);
        //System.out.println(ans);

        int [] arr={1,2,3,4,5,6,7,8,9,10};
        revArray(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));

        String s="1233213";
        System.out.println(checkPallin(s, 0, s.length()-1));
        for (int index = 0; index < 10; index++) {
            System.out.println(fibo(index));
            
        }
        
        
    }

    public static void func(String name,int n){
        if(n>5){
            return;
        }
        System.out.print(name);
        System.out.println(" "+n);
        n++;
        func(name,n);
    }
    public static void func2(int i,int n){
        if(i>n){
            return;
        }
        System.out.println(i);
        
        
        func2(i+1,n);
    }
    public static void func3(int i,int n){
        if(i>n){
            return;
        }
        func3(i+1,n);
        System.out.println(i);
        
       
    }
    public static void func4(int i,int n){
        if(i<1){
            return;
        }
        func4(i-1,n);
        System.out.println(i);
        
        
        
    }

    public static void func5(int i,int n){
        if(i>5){
            return;
        }
        func5(i+1,n);
        System.out.println(i);
    }
    public static int sumrec(int i,int n,int sum){
        if(i>n){
            return sum;
        }
        return sumrec(i+1,n,sum+i);
    }

    public static int sumrec2(int i){
        if(i==0){
            return 0;
        }
        return i+sumrec2(i-1);
    }
    public static int fact(int i){
        if(i==0 || i==1){
            return 1;
        }
        return i*fact(i-1);
    }

    public static void revArray(int[] arr,int st,int end){
        if(st>=end){
            return;
        }
        int temp=arr[st];
        arr[st]=arr[end];
        arr[end]=temp;
        revArray(arr, st+1, end-1);
    }

    public static boolean checkPallin(String s,int i,int j){
        if(i>=j){
            return true;
        }
        if(s.charAt(i)!=s.charAt(j)){
            return false;
        }
        return checkPallin(s, i+1, j-1);
    }

    public static int fibo(int n){
        if(n==0 || n==1){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }


}