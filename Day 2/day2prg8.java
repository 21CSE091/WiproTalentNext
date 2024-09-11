public class day2prg8{
    public static void main (String[] args) {
        for(int i=10;i< 100;i++){
            if (isPrime(i)){
                System.out.print(i);
                System.out.print(" ");
            }
        }
    }
    public static boolean isPrime(int num){
        if(num<=1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}