import java.util.Scanner;
public class day3prg1{
    public static void main (String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter length");
        int n=obj.nextInt();
        int[] arr=new int[n];
        int sum=0;
        System.out.println("Enter Array");
        for(int i=0;i<n;i++){
            arr[i]=obj.nextInt();
            sum=sum+arr[i];
        }
        System.out.println("Sum= "+sum);
        System.out.println("Average= "+sum/n);
    }
}