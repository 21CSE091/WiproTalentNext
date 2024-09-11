import java.util.Scanner;
public class day3prg3{
    public static void main (String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter Array length");
        int n=obj.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter Array");
        for(int i=0;i<n;i++){
            arr[i]=obj.nextInt();
        }
        System.out.println();
        int temp;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("Sorted Array");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}