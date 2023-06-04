import java.util.*;
import java.util.Scanner;
public class Arusi;
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int[] arr1 = new int[n1];
        
        int[] arr2 = new int[n2];
        for(int i = 0;i < n1;i++){
            arr1[i] = input.nextInt();
        }
        for(int i = 0;i < n2;i++){
            arr2[i] = input.nextInt();
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int[] mergedArr = merge(arr1, arr2);
        //System.out.println(Arrays.toString(mergedArr));
        int reversedArray[] = new int[mergedArr.length];
        for(int i = 0;i < mergedArr.length;i++){
            reversedArray[i] = mergedArr[mergedArr.length-1-i];
            System.out.println(reversedArray[i]);
        }
        
    }
     public static int[] merge(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] mergedArr = new int[n1 + n2];
        int i = 0, j = 0, k = 0;
        while (i < n1 && j < n2) {
            if (arr1[i] <= arr2[j]) {
                mergedArr[k++] = arr1[i++];
            } else {
                mergedArr[k++] = arr2[j++];
            }
        }
        while (i < n1) {
            mergedArr[k++] = arr1[i++];
        }
        while (j < n2) {
            mergedArr[k++] = arr2[j++];
        }
        return mergedArr;
}
}

    