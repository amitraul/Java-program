import java .util.Scanner;

import javax.lang.model.util.ElementScanner14;
import javax.lang.model.util.ElementScanner6;
public class Example_1 {
    public static void main(String[] args){
        int Assets;
        Scanner done=new Scanner(System.in);
        System.out.println("enter a value for a string");
        Assets=done.nextInt();
        if(Assets>=15000){
            System.out.println("the person is rich guy");
            if(Assets>=16000&&Assets <=50000){
                System.out.println("the person was ultra rich"); 
            }
            else
            System.out.println("the person ismiddle class");    
        }
        else
        System.out.println("the person was poor");
    }
    

}
