package Assignment_1;

import java.util.Scanner;

public class Codeforces_Watermelon {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            if (n < 3 || n % 3 == 0) {
                System.out.println("NO");
            } else {
                if (n != 5) {
                    System.out.println("YES");
                    System.out.println(1 + " " + 2 + " " + (n - 3));
                } else {
                    System.out.println("YES");
                    System.out.println(1 + " " + 4 + " " + (n - 5));
                }
            }
        }
        sc.close();
    }
}
