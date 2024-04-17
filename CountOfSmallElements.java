public class CountOfSmallElements{
    static int countSmallAndEqualElements(int[] a,int key){

        int l=0, h=a.length-1 ,mid=0;
        while(l <= h){
            mid = (l+h)/2;
            if(key == a[mid]){
                while(mid+1 <a.length && a[mid+1]==key  ){
                    mid++;           //Duplicates can exist
                }
                break;
            }
            else if(key < a[mid]){
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }

        if( a[mid] > key){
            return mid;
        }
        else
            {
                return mid+1;
            }
    }

    public static void main(String[] args) {
        // int[] arr={2,6,12,18,21,26,33,42};
        // int[] arr={2,6,12,18,21,26,26,26}; Duplicates Exist
        int[] arr={2,6,12,18,21,26,28,30};  //Value doesn't exist
        int key = 25;
        System.out.println(countSmallAndEqualElements(arr, key));
    }
}