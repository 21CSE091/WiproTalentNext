import java.util.Scanner;
public class day2prg1{
    public static void main (String[] args) {
        Scanner obj=new Scanner(System.in);
        char first=obj.next().charAt(0);
        char second=obj.next().charAt(0);
        if(first>second){
            System.out.print(second+","+first);
        }
        else{
            System.out.print(first+","+second);
        }
    }
}