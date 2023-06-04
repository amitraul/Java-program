import java.util.Scanner;
public class Recursion1 {
    public static void findgcdandlcm(int n,int m){
        int i,l,g=0;
        for(i=1;i<=n&&i<=m;i++){
            if(n%i==0&&m%i==0){
                g=i;

            }
        }
        l=(n*m)/g;
        System.out.println("gcd of two number:"+g+"\n "+"lcm of two number:"+l);

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        findgcdandlcm(n ,m);
    }
    
}
