//factorial of given number
import java.util.Scanner;
class Q1{
    public static void main(String arg[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt(),mal=1;
        for(int i=1;i<=n;i++){
            mal*=i;
        }
       System.out.print(mal);
    }
}