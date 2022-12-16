import java.util.Scanner;
public class Nira {
    public static void main(String[] args){
        System.out.println("press 1for addition");
        System.out.println("press 2 for subtraction");
        System.out.println("press 3 for multipication");
        System.out.println("print4 for division");
        Scanner Sc=new Scanner(System.in);
        System.out.println();
        int r=Sc.nextInt();
        double a,b,c;
        System.out.println("Enetr 1st number:");
        a=Sc.nextDouble();
        System.out.println("enter2nd number:");
        b=Sc.nextDouble();
        switch (r){
            case 1:c=a+b;
            System.out.println("reasult is:"+c);
            case 2:c=a-b;
            System.out.println("result is:"+c);
        case 3:c=a*b;
    System.out.println("result is:"+c);
case 4:c=a/b;
System.out.println("result is:"+c);
defult:
System.out.println("wrong input");
     }
    

    }
    
}
