package Graph;
public class SwapBits {
    static int swapEvenOddBits(int n){
        return ((n&0xaaaaaaaa)>>>1)|((n&0x55555555)<<1); //left paranthesis moves even bit to odd places and
                                                        //right paranthesis moves odd bits to even places
    }

    public static void main(String[] args) {
        System.out.println(swapEvenOddBits(181));
    }
    
}
