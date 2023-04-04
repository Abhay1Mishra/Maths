import java.lang.reflect.Array;
import java.util.Arrays;

public class Sieve_of_Eratosthenes {

    public static void main(String[] args) {
        int x =12;
        boolean[] arr =sieveoEratosthenes(x);
        for (int i=0;i<arr.length;i++){
            System.out.println(i+ " " + arr[i]) ;
        }
    }

    private static boolean [] sieveoEratosthenes(int x) {
        boolean[] arr =new boolean[x+1];
        Arrays.fill(arr,true);
        arr[0] = false;
        arr[1] =false;
        for (int i=2;i*i<=x;i++){
            for (int j=2*i;j<=x;j+=2){
                arr[j] =false;
            }
        }

        return arr;
    }

}
