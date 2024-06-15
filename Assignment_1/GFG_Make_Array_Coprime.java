package Assignment_1;

import java.util.Scanner;

public class GFG_Make_Array_Coprime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(countCoPrime(arr,n));

        sc.close();
    }

    public static int countCoPrime(int []a, int n)
    {
        int count=0;
        for(int i=0;i<n-1;i++){
            if(gcd(a[i],a[i+1]) != 1)
                count++;
        }
        return count;
    }

    public static int gcd(int num1,int num2){
        if(num2==0)return num1;

        return gcd(num2,num1%num2);
    }
}
