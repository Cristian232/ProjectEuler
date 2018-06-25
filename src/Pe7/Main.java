package Pe7;
//By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
//
//        What is the 10 001st prime number?

public class Main {
    public static void main(String[] args) {
            show(longArr());
    }

    public static boolean isPrime(long n){
        for (int i = 2; i < n ; i++) {
            if (Integer.valueOf((int)n).equals(2)){
                return true;
            }
            if (n%i==0){
                return false;
            }
        }
        return true;
    }

    public static long[] longArr(){
        long[] x = new long[10001];
        long c = 2;
        int count = 0;
        while (count<10001){
            if (isPrime(c)){
                x[count] = c;
                count++;
            }
            c++;
        }

        return x;
    }

    public static void show(long[] a){
        for (int i = 9990; i < 10001 ; i++) {
            System.out.println("#" + i + " " + a[i]);
        }
    }

}
