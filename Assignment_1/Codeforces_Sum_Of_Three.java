package Assignment_1;

import java.util.Scanner;

public class Codeforces_Sum_Of_Three {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            if(n<7 || n==9){
                System.out.println("NO");
            }
            else {
                System.out.println("YES");
                int val = n - 3;
                if (val % 3 != 0) {
                    System.out.println(1 + " " + 2 + " " + (val));
                } else {
                    System.out.println(1 + " " + 4 + " " + (val - 2));
                }
            }
        }
        sc.close();
    }
}
