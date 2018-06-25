package Pe3;

//The prime factors of 13195 are 5, 7, 13 and 29.

// What is the largest prime factor of the number 600851475143 ?

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static List<Long> primeFactors(Long n){
        List<Long> x = new ArrayList<>();
        for (long i = 2; i <= n ; i++) {
            while ( n%i == 0){
                x.add(i);
                n = n / i;
            }
        }
        if (n > 1) {
            x.add(n);
        }
        return x;
        }

        public static void main(String[] args) {


            for (Long x:primeFactors(600851475143L)) {
                System.out.println(x);
            }

    }

}
