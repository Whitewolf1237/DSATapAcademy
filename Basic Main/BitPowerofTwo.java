package Graph;
public class BitPowerofTwo {
    static bo
    olean powOfTwo(int n){
        if(n<=0){
            return false;
        }
        return (n & (n-1))==0;
    }
    
}
