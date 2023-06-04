import java.util.Scanner;
public class Source{
    public int InsertionSort(int[]a,int temp) {
        for (int i = 1; i < a.length; i++) {
            temp = a[i];
            int j=i;
            for (; j > 0 && a[j - 1] > temp; j--) {
                a[j] = a[j - 1];

            }
            a[j] = temp;
        }
        return temp;
    }
    public static void main(String args[]) {
        int size;
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();
        int[] a = new int[size];
        int i=1;
        for (; i < a.length; i++) {
            a[i] = sc.nextInt();

        }

        System.out.print(a[i]+" ");
    }
}