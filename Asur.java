
    import java.util.ArrayDeque;
import java.util.Queue;
import java.util.*;
public class Asur{
 
    public static void generate(int n){
        Queue<String> q = new ArrayDeque<>();
        q.add("1");
        int i = 1;
        while (i++ <= n){
            q.add(q.peek() + '0');
            q.add(q.peek() + '1');
            System.out.print(q.poll() + ' ');
        }
    }
 
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        generate(n);
        
}
}


