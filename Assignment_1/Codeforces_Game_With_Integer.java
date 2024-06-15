package Assignment_1;

import java.util.Scanner;

public class Codeforces_Game_With_Integer {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int num= sc.nextInt();
            if(num%3 == 0){
                System.out.println("Second");
            }
            else if((num-1)%3 == 0 || (num+1)%3 == 0){
                System.out.println("First");
            }
            else if((num-2)%3 == 0 || (num+2)%3 == 0){
                System.out.println("Second");
            }
        }
        sc.close();
    }
}
