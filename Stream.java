import java.util.List;
import java.util.ArrayList;
public class Stream {
    public static void main(String[]args){
        List<Integer>list1=new ArrayList<Integer>();
        list1.add(3);
        list1.add(43);
        list1.add(23);
        list1.add(34);
        list1.add(4);
        list1.add(54);
        list1.add(32);
        list1.add(29);
       list1.stream().forEach(e->{System.out.print(e+" ,");});
     
    }
    
}
