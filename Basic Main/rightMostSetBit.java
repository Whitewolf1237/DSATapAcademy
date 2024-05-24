package Graph;
public class rightMostSetBit {
    static int posOfRMSPEasy(int n){
        // int m = n & (n-1);
        // n = n^m;
        return (int)(Math.log10(n^(n & (n-1))) / Math.log10(2)) +1;
    }

    static int posOfRMSP(int n){
        int m=1;
        int pos=0;
        if(n == 0){
            return -1;
        }
        while( (n & m) == 0){
            m = m<<1;
            pos++;
        }
        return pos+1; //zero based indexing so +1
    }
    public static void main(String[] args) {
        System.out.println(posOfRMSPEasy(40));
        System.out.println(posOfRMSP(40));
    }
}
