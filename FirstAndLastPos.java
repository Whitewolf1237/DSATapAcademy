public class FirstAndLastPos {
    static int[] SearchRange(int[] a,int key){
        int l=0,h=a.length-1,mid=0;
        int[] res={-1,-1};
        while(l<=h){
            mid=(l+h)/2;
            if(a[mid]==key){
                res[0]=mid;
                h=mid-1;
            }
            else if(a[mid]<key){
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        }
        l=0;
        h=a.length-1;
        mid=0;
        while(l<=h){
            mid=(l+h)/2;
            if(a[mid]==key){
                res[1]=mid;
                l=mid+1;
            }
            else if(a[mid]<key){
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        }
        return res;
    }
}
