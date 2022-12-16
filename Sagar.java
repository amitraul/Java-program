import javax.swing.JOptionPane;
public class Sagar {
    public static void main(String[] args){
        double Pi=Double.parseDouble(JOptionPane.showInputDialog(null,"Eneter avlaue for anumber"));
        System.out.println();
        int r=Integer.parseInt(JOptionPane.showInputDialog(null,"enter a number"));
        System.out.println();
        double area=Pi*r*r;
        JOptionPane.showMessageDialog(null,"enter the area of circle is:"+area);
    }
}
