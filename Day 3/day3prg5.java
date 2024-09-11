import java.util.Scanner;
public class day3prg5{
    public static void main (String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=3;
        int[] a=new int[n];
        int[] b=new int [n];
        System.out.println("Enter Array elements of 'a'");
        for(int i=0;i<n;i++){
            a[i]=obj.nextInt();
        }
        System.out.println("Enter Array elements of 'b'");
        for(int i=0;i<n;i++){
            b[i]=obj.nextInt();
        }
        int middle=n/2;
        int[] c=new int[2];
        c[0]=a[middle];
        c[1]=b[middle];
        System.out.println("Middle elements Array");
        for(int i=0;i<c.length;i++){
            System.out.print(c[i]+" ");
        }
        
    }
}