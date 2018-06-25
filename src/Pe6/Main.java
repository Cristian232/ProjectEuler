package Pe6;
//The sum of the squares of the first ten natural numbers is,
//
//        1^2 + 2^2 + ... + 10^2 = 385
//        The square of the sum of the first ten natural numbers is,
//
//        (1 + 2 + ... + 10)^2 = 55^2 = 3025
//        Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
//
//        Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
//        BTW ^ operator is XOR  in java   instead use Math.pow()

public class Main {
    public static void main(String[] args) {
        int n = 100;
        System.out.println(difOfSums(sqrOfSum(n),sqrSum(n)));
        System.out.println(sqrOfSum(n));
        System.out.println(sqrSum(n));
    }

    public static long sqrSum(int n){
        long x = 0;
        for (int i = 0; i <= n ; i++) {
            x = (long) (x+(Math.pow(i,2)));
        }
        return x;
    }

    public static long sqrOfSum(int n){
        long x = 0;
        for (int i = 0; i <= n ; i++) {
            x = (x + i);
        }
        return (long) Math.pow(x,2);
    }

    public static long difOfSums(long n,long m){
        long x ;
        x = n - m;
        return x;
    }
}
