package Graph;
public class NPrimeNumbers {

    static void sievePrintPrime(int n){
        boolean[] prime=new boolean[n+1];
        for(int i=2;i<=n;i++){
            if(prime[i]==false){
                for(int j=i*2;j<=n;j=j+i){
                    prime[j]=true;
                }
            }
        }
        for(int i=2;i<=n;i++){
            if(prime[i]==false){
                System.out.println(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        sievePrintPrime(2);
    }
}
