import java.util.Scanner;
public class Function1 
{
    public void Prime(int n)
    {
        for(int i=1;i<n;i++)
        {
            int k=0;
        for (int j=1;j<=i;j++)
        {
            if(i%j==0)
            {
                k++;
            }
        }
        if(k==2)
        
        {
            System.out.println(i);
        }
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Function1 obj=new Function1();
        obj.Prime(n);
    }
}
