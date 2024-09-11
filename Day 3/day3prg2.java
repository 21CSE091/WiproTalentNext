import java.util.Scanner;
public class day3prg2{
    public static void main (String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter length of Array");
        int n=obj.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter Array");
        for(int i=0;i<n;i++){
            arr[i]=obj.nextInt();
        }
        int counter=0;
        System.out.println("Enter number to check");
        int check=obj.nextInt();
        for(int i=0;i<n;i++){
            if(check==arr[i]){
                System.out.println("Index value=arr["+i+"]");
                counter=1;
            }
        }
        if(counter==0){
            System.out.println(-1);
        }
        
    }
}