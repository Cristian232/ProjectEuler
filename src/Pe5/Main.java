package Pe5;
//2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
//What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
public class Main {
    public static void main(String[] args) {

        //System.out.println(isDiv(220));
        checkInts();


    }

    public static boolean isDiv(long n){
        boolean test = false;
        for (long i = 1; i <= 20 ; i++) {
            if(n%i==0){
                test = true;
            }else {
                test = false;
                return test;
            }
        }
        return test;
    }

    public static void checkInts(){
        long n = 20;
        boolean t = false;
        while (!t){
            t = isDiv(n);
            if (t)
            System.out.println(n + " " + t);
            n++;

        }
    }
}
