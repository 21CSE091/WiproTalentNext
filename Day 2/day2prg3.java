import java.util.Scanner;
public class day2prg3{
    public static void main (String[] args) {
        Scanner obj=new Scanner(System.in);
        int num1=obj.nextInt();
        int num2=obj.nextInt();
        if(num1%10==num2%10){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}