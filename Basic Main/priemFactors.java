package Graph;
public class priemFactors {
    static void priemFactorsMain(int n){
        int i=2;
        while(n>1){
            while(n%i==0)
            {
                System.out.println(i);
                n = n/i;
            }
            i++;
        }
        }
        public static void main(String[] args) {
            priemFactorsMain(13);
        }
}
