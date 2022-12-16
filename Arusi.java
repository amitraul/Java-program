import javax.swing.JOptionPane;
public class Arusi {
    public static void main(String[] args){
        int a=Integer.parseInt(JOptionPane.showInputDialog(null,"enter first number"));
        System.out.println();
        int b=Integer.parseInt(JOptionPane.showInputDialog(null,"enter a another number"));
        System.out.println();
        int c=a+b;
        JOptionPane.showMessageDialog(null,"enter the no is sum:"+c);
    }
    
}
