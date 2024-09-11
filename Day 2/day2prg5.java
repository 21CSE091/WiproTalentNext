import java.util.Scanner;
public class day2prg5{
    public static void main (String[] args) {
        Scanner obj=new Scanner(System.in);
        long num=obj.nextLong();
        long sum;
        for(sum=0;num!=0;num/=10){
            sum=sum+num%10;
        }
        System.out.println(sum);
    }
}