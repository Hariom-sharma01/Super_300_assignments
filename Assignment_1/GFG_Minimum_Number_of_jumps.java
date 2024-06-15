package Assignment_1;

import java.util.Scanner;

public class GFG_Minimum_Number_of_jumps {
    public static void main(String[] args) {
           Scanner sc=new Scanner(System.in);
           int n=sc.nextInt();
           int []arr=new int[n];
           for(int i=0;i<n;i++){
               arr[i]=sc.nextInt();
           }
           System.out.println(minJumps(arr,n));
           
           sc.close();
    }
    public static int minJumps(int[] arr, int n) {
        if(n<=1)
            return 0;
        if(arr[0]==0)
            return -1;
        int jumps=1;
        int steps=arr[0];
        int reach=arr[0];
        for(int i=1;i<n;i++){
            if(i==n-1)
                return jumps;
            reach=Math.max(reach,arr[i]+i);
            steps--;
            if(steps==0){
                jumps++;
                if(i>=reach)
                    return -1;
                steps=reach-i;
            }
        }
        return -1;
    }
}
