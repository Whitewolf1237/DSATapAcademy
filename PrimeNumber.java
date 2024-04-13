import java.util.Scanner;

public class PrimeNumber {
    static boolean isPrime(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int n = scan.nextInt();
        if(isPrime(n)==true){
            System.out.println("Prime Number");
        }
        else{
            System.out.println("Non Prime");
        }
    }

}
