package Graph;
public class NumberOfTrailingZeroBit {
    static int numberOfTz(int n){
        return (int)(Math.log10(n^(n & (n-1))) / Math.log10(2)) ;
    }
    public static void main(String[] args) {
        System.out.println(numberOfTz(128));
    }
    
}
