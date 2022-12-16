 import java.util.Scanner;
public class Manisha{
    public static void main(String[] args) {
        final double  Pi=3.14,AREA;
        int r;
        System.out.println("Enter radius of circle ");
        Scanner R= new Scanner(System.in) ;
        r=R.nextInt();
        AREA=Pi*r*r;
        System.out.print("Area of circle"+AREA);
    }

}

    