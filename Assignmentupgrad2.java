
import java.util.Scanner;
public class Assignmentupgrad2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of elements in an array:");
        int length  = scanner.nextInt();
        int array[] = new int[length + 1];
        System.out.println("Enter the key number:");
        int key  = scanner.nextInt();
        System.out.println("Enter array elements:");
        for(int i = 1; i <= length; i++){
            array[i] = scanner.nextInt();
        }
        if (length == 0) {
            System.out.println("Length should be greater than 0");
        }
        else {
            int index = getSubArray(array, key);
            if (index > -1) {
                System.out.println(index) ;
            }
            else {
                System.out.println("NOT_FOUND");
            }
        }
    }
    public static int getSubArray(int array[], int key) {
        int start = 1;
        int end = 2;
        end = getValidEndIndex(array, start, end);
        while (array[end] < key) {
            int tempEnd = end*2;
            end = getValidEndIndex(array, start, tempEnd);
            if(tempEnd > end) {
                break;
            }
        }
        return binarySearch(array, start, end, key);
    }
    public static int binarySearch(int array[], int start, int end, int key) {
        while (start <= end) {
            int mid = start + (end-start)/2;
            if (key == array[mid]) {
                return mid;
            }
            if (key <= array[mid]) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return -1;
    }
    public static int getValidEndIndex(int array[], int start, int end) {
        try {
            int value = array[end];
            return end;
        } catch(ArrayIndexOutOfBoundsException e) {
            if(end >= start) {
                end -= 1;
                return getValidEndIndex(array, start, end);
            }
            else {
                return end;
            }
        }
    }
}
  

