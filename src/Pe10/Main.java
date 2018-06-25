package Pe10;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

//The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
//
//        Find the sum of all the primes below two million.
public class Main {
    public static void main(String[] args) {

        System.out.println(sumList(primeList(2000000)));
    }

    public static boolean isPrime(int n){
        if(n == 2){
            return true;
        }
        for (int i = 2; i < n ; i++) {
            if (n%i==0){
                return false;
            }
        }

        return true;
    }

    public static List<Integer> primeList(int n){
        List<Integer> x = new ArrayList<>();
        for (int i = 2; i < n ; i++) {
            if (isPrime(i)){
                x.add(i);
                //System.out.println(i);
            }
        }

        return x;
    }

    public static BigInteger sumList(List<Integer> x){
        BigInteger n = BigInteger.valueOf(0);

        for (int i = 0; i < x.size() ; i++) {
            n = n.add(BigInteger.valueOf(x.get(i)));
        }

        return n;
    }
}
