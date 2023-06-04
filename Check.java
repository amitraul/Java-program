import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;
public class Check {
    public static void calculate(int num){
        int rev=0,rem,temp=num;
        while(num>0){
           rem=num%10;
          num=num/10;
          rev=rev*10+rem;  
        }
        if(rev==temp)
        System.out.println("number is pallindrome number"+temp);
        else
        System.out.println("number is not a pallindrome number"+temp);
    
    }

    public static void main(String[] args)throws Exception{
        InputStreamReader in=new InputStreamReader(System.in) ;
            BufferedReader br=new BufferedReader(in);
            String S=br.readLine();
            int num=Integer.parseInt(S);
            
       calculate(num);

    }
}
