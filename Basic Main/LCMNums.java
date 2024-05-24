package Graph;
import java.util.Scanner;

public class LCMNums {

    static int findLcmMain(int a,int b){
        return (a*b)/euclidsGCD(a, b);
    }

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

    static int findLCM(int a,int b){
        int res=Math.max(a, b);  //point from where we have to start iteration
        while(true){
            if(res%a==0 && res%b==0){
                break;
            }
            res++;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println(findLcmMain(a, b));
    }
}
