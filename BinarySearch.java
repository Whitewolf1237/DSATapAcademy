import java.util.Arrays;

public class BinarySearch{
    static int BinSearch(int key, int[] a){
        int l = 0;
        int h=a.length - 1;
        int mid = 0;
        while(l <= h){
            mid=(l+h)/2;
            if(key==a[mid]){
                return mid;
            }
            else if(key<a[mid]){
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return -1;
    }

    static int cielOfNumber(int[] a,int n){
        Arrays.sort(a);
        for(int i =0;i<a.length;i++){
            if(a[i]>=n){
                return a[i];
            }
            
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] a = {3,5,6,8,12,15,16,19,21};
        Arrays.sort(a);
        int key = 13;
        System.out.println(BinSearch(key,a));
        System.out.println(cielOfNumber(a, 20));
    }
}