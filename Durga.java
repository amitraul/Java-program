import java.util.Scanner;
public class Durga{
    public static void main(String[] args){
        int age;
        Scanner NUM=new Scanner(System.in);
        System.out.println("Enter a age");
        age=NUM.nextInt();
        if(age>=18)
        System.out.println("the person was eligible to vote");
        else
        System.out.println("the person was not eligible to vote");

    }
}