import java.util.Scanner;

public class bitManipulationOne {

    static String decimalToBinary(int n){
        String b= "";
        while(n>=1){
            int x=n%2; //stores remainder of division
            n=n/2; //update given number
            b = x+b; //adds remainder in reverse order
        }
        return b;
    }
    static int binaryToDecimal(String b){
        int res= 0;
        int powOf2=1;
        for(int i=b.length()-1;i>=0;i--){
            if(b.charAt(i)=='1'){
                res = res + powOf2;
            }
            powOf2 = powOf2 * 2;
        }
        return res;
    }


    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int n = scan.nextInt();
        String b=decimalToBinary(n);
        System.out.println(b);
        System.out.println(binaryToDecimal(b));
    }
}
