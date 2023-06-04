import java.util.Scanner;
public class Armstrongnumber {
    public static void Armstrong(int n)
    {
        int sum=0,r,temp=n;
        while(n>0)
        {
            r=n%10;
            n=n/10;
            sum=sum+r*r*r;
        }
        if(temp==sum)
        {
            System.out.println("the number was Armstrong"+temp);
        }
        else
        {
            System.out.println("the number was not Armstrong"+temp);
        }

    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Armstrong(n);

    }
    
}
