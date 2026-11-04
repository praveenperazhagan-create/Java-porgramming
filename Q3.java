//leet code problem 136 
import java.util.*;
class Q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),ans=0;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            ans^=arr[i];
        }
        System.out.println(ans);
    }
}