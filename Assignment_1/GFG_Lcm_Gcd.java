package Assignment_1;

import java.util.Scanner;

public class GFG_Lcm_Gcd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Long A=sc.nextLong();
        Long B=sc.nextLong();
        Long[] ans=fun(A,B);
        System.out.println(ans[0]+" "+ans[1]);

        sc.close();
    }
    public static Long[] fun(Long A,Long B){
        long g_cd=gcd(A,B);
        long lcm=A*B/g_cd;
        Long[] ans={lcm,g_cd};
        return ans;
    }

    public static Long gcd(Long num1,Long num2){
        if(num2==0)return num1;

        return gcd(num2,num1%num2);
    }
}
