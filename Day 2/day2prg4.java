import java.util.Scanner;
public class day2prg4{
    public static void main (String[] args) {
        Scanner obj=new Scanner(System.in);
        int num=obj.nextInt();
        int remainder;
        int reverse=0;
        while(num>0){
            remainder=num%10;
            reverse=reverse*10+remainder;
            num=num/10;
        }
        System.out.println(reverse);
    }
}