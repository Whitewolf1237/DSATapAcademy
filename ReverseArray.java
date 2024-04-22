public class ReverseArray {

    static void reverse(int[] ar){
        int i=0,j=ar.length-1;
        while(i<=j){
            int t=ar[i];
            ar[i]=ar[j];
            ar[j]=t;
            i++;
            j--;
        }
    }
    
}
