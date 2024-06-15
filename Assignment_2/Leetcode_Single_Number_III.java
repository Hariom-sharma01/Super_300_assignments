package Assignment_2;

import java.util.Scanner;

public class Leetcode_Single_Number_III {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        int[] ans=singleNumber(arr);
        System.out.println("["+ans[0]+","+ans[1]+"]");

        sc.close();
    }

    public static int[] singleNumber(int[] nums) {
        int x_or = 0;
        for (int num : nums) {
            x_or = x_or ^ num;
        }
        int r_bit= x_or & -x_or;

        int n1 = 0;
        int n2 = 0;

        for (int num : nums) {
            if ((num & r_bit) == 0) {
                n1 = n1 ^ num;
            } else {
                n2 = n2 ^ num;
            }
        }

        int[] result = new int[2];
        result[0] = n1;
        result[1] = n2;
        return result;
    }
}
