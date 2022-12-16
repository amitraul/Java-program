import java.util.Scanner;
public class Rajesh {
    public static void main(String[] args){
        Scanner MARKS= new Scanner(System.in);
        System.out.println("enter a value for a marks");
        int mark = MARKS.nextInt();
        if(mark>=35){
            System.out.println("this student is pass");
            if(mark<=80){
                System.out.println("this student is secure first division");
            }
            else
            System.out.println("this person is third class");
        }
            else
            System.out.println("this student was failed");

    } 
    
}
