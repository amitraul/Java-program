import java.util.Scanner;
public class Assignmentupgrad1 {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Eneter the number of element in array:");
        int n=sc.nextInt();
        int[]array=new int[n+1];
        System.out.println("Enter the element in array:");
        for(int i=1;i<=n;i++){
            array[i]=sc.nextInt();
        }
        int res=binarysearch(array,1,n);
        if(res==-1){
            System.out.println("Element not found");
        }else{
            System.out.println(res);
        }
    }
    public static int binarysearch(int[]array,int start,int end){
        while(start<=end){
            int m=start+(end-start)/2;
            if(array[m]==m){
                return m;
            }
            else if(array[m]>m){
                end=m-1;
            }else{
                start=m+1;
            }
        }
        return -1;
    }
}
