//Java program to add  two complex number
import java.util.*;
 public class Simple {
    static void check(int n){
            while(n>0){
            if(n%2==0){
                System.out.println("the number was even:"+n);
                
            }else{
                System.out.println("the number was odd:"+n);
            }

        
         }
        check(n-1);
                
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
      
    
    }


}
