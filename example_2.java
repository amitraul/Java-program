import java.util.Scanner;
public class example_2 {

    public static void main(String[] args){
        int sum=0;
        int num,r;
        Scanner demo=new Scanner(System.in);
        System.out.println("enter a value of number");
        num=demo.nextInt();
        while(num>0){
            r=num%10;
            num=num/10;
            sum=sum+r;
            System.out.println("to dtermine the sum:"+sum);
        }
        System.out.println("the operation was revoke");
    
    }

}
