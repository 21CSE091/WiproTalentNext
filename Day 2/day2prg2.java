import java.util.Scanner;
public class day2prg2{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        char c=obj.next().charAt(0);
        char color=Character.toUpperCase(c);
        switch(color){
            case 'R':
                System.out.println("Red");
                break;
            case 'B':
                System.out.println("Blue");
                break;
            case 'G':
                System.out.println("Green");
                break;
            case 'O':
                System.out.println("Orange");
                break;
            case 'Y':
                System.out.println("Yellow");
                break;
            case 'W':
                System.out.println("White");
                break;
            default:
                System.out.println("Invalid Code");
        }
    }
} 