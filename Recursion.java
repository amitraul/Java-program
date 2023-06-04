// Calculate factorial using recursion
import java.util.Scanner;
public class Recursion{
    public  int findgcd(int n,int m){
        if(m==0)
            return n;
        else
          return findgcd(m,n%m);
        
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        Recursion g=new Recursion();
        System.out.println(g.findgcd(n,m));
    }
}