package Assignment_2;

import java.util.Scanner;

public class Leetcode_Triples_with_Bitwise_AND_Equal_To_Zero {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        
        System.out.println(countTriplets(arr));

        sc.close();
    }

    public static int countTriplets(int[] arr) {
        int[] freq = new int[1 << 16];
        
        for (int a : arr) {
            for (int b : arr) {
                freq[(a & b)]++;
            }
        }
        
        int ans = 0;
        
        for (int v: arr) {
            for (int i = 0; i < (1 << 16); i++) {
                if ((v & i) == 0) {
                    ans += freq[i];
                }
            }
        }

	    return ans;

    }
}
