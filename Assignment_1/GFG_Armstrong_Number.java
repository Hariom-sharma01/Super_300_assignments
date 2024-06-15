package Assignment_1;

import java.util.Scanner;

public class GFG_Armstrong_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(armstrongNumber(n));

        sc.close();
    }

    public static String armstrongNumber(int n) {
        int sum=0;
        int num=n;
        while(n!=0){
            int rem=n%10;
            n=n/10;
            sum+=Math.pow(rem,3);
        }
        if(sum==num)return "true";
        
        return "false";
    }
}
