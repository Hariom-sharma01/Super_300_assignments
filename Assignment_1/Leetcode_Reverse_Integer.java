package Assignment_1;

import java.util.Scanner;

public class Leetcode_Reverse_Integer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        long sum=0;
        long mul=10;
        while(num!=0)
        {
            long rem=num%10;
            num=num/10;
            sum=sum*mul+rem;
        }
        if(sum>=Integer.MAX_VALUE || sum<=Integer.MIN_VALUE)
        System.out.println("0");
        else
        System.out.println((int)sum);

        sc.close();
    }
}
