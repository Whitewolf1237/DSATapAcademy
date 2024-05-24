package Graph;
import java.util.Scanner;

public class GcdofNums {

    static int euclidsGCD(int a, int b){  //euclids method
        while(a!=b){    
            if(a>b){
                a=a-b;
            }
            else{
                b=b-a;
            }
        }
     
        return a;
    }

    static int GCD(int a, int b){    //brainstorm method
        int minNum=Math.min(a, b);
        int res=0;
        for(int i=minNum;i>=1;i--){
            if(a%i==0 && b%i==0){
                res=i;
                break;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println(GCD(a, b));
        System.out.println(euclidsGCD(a, b));
    }
    
}
