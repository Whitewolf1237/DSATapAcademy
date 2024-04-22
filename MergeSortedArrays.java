public class MergeSortedArrays{


    public static float findMedian(int[] ar1,int[] ar2){
        int i=0,j=0,k=0;
        int[] m = new int[ar1.length + ar2.length];
        //Merge sorted Array
        while(i<ar1.length && j<ar2.length &&k<=m.length/2){
            if(ar1[i]<ar2[j]){
                m[k]=ar1[i];
                i++;
                k++;
            }
            else{
                m[k]=ar2[j];
                j++;
                k++;
            }
        }
        //earlier loop did exit but without  iterating through one of the given array
        while(i<ar1.length){
            m[k]=ar1[i];
            i++;
            k++;
        }
        while(j<ar2.length){
            m[k]=ar2[i];
            j++;
            k++;
        }
        if(m.length %2==0){  //Even length
            int mid = m.length / 2;
            return (float)(m[mid]+m[mid-1])/2;
        }
        else{
            int mid = m.length/2;
            return m[mid];
        }
    }

    public static void main(String[] args) {
        int[] ar1= {1,3,8,17};
        int[] ar2 = {5,6,7,19,21,25};
        System.out.println(findMedian(ar1, ar2));
    }

}