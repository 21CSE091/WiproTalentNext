import java.util.Scanner;
public class day2prg6{
    public static void main (String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Please enter an integer value");
        int num=obj.nextInt();
        for(int i=0;i<num;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}