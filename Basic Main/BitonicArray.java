package Graph;
public class BitonicArray{
    static int descendingBinarySearch(int[] a,int key, int range){
        int l=range,h=a.length-1,mid=0;
        while(l<=h){
            mid=(l+h)/2;
            if(key==a[mid]){
                return mid;
            }else if(key<a[mid]){
                l=mid+1;
                
            }else{
                h=mid-1;
            }
        }
        return -1;
    }

    static int ascendingBinarySearch(int[] a,int key,int range){
        int l=0, h=range, mid=0;
        while(l<=h){
            mid=(l+h)/2;
            if(key==a[mid]){
                return mid;
            }else if(key<a[mid]){
                h=
                
                mid-1;
            }else{
                l=mid+1;
            }
        }
        return -1;
    }

    static int findBitonicPoint(int[] a){
        int l=0,m=0,r=a.length-1;
        while(l<=r){
            m=(l+r)/2;
            if(a[m]>a[m-1] && a[m]>a[m+1]){
                return m;
            }
            else if(a[m]>a[m-1] && a[m]<a[m+1]){
                l=m;
            }
            else{
                r=m;
            }
        }
        return -1;
    }


    static int searchBitonic(int[] a, int key, int bIndex){
        if(key==a[bIndex]){
            return bIndex;
        }
        if(key > a[bIndex]){
            return -1;
        }
        int res1 = ascendingBinarySearch(a, key, bIndex-1);
        if(res1 != -1){
            return res1;
        }
        int res2 = descendingBinarySearch(a, key, bIndex+1);
        if(res2 != -1){
            return res2;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {5,6,7,8,9,10,3,2,1};
        int b = 8;
        int bIndex = findBitonicPoint(a);
        System.out.println(searchBitonic(a, b, bIndex));
    }
}