import java.util.Scanner;

public class TrailingZerosFact {
    static int trailingZeroes(int n) {
        int res=0;
        int powOf5=5;  //because 5^1=5 i.e the first term
        while(n >= powOf5){   //terminates when the numberator is greater than the denominator
            res += n/powOf5;
            powOf5 *= 5;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println("No. of trailing zeros are:"+trailingZeroes(n));
    }
}

