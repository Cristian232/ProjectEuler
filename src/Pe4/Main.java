package Pe4;
//A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
//Find the largest palindrome made from the product of two 3-digit numbers.

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        for (Integer x:listOfNumb()) {
            System.out.println(x);
        }

//     System.out.println(isPalidrome(2022));
//        System.out.println(reverseInt(101));
     //   System.out.println(1%10);
    }

    public static boolean isPalidrome(int n){
        Integer x = n;
        Integer y = reverseInt(x);
        if (x.equals(y)){
            return true;
        }
        return false;
    }

    public static List<Integer> listOfNumb(){
        List<Integer> x = new ArrayList<>();
        for (int i = 100; i < 1000 ; i++) {
            for (int j = 100; j < 1000 ; j++) {
                int c = j*i;
                if (!x.contains(c)&&isPalidrome(c)){
                x.add(c);
            }
        }
        }
        return x;
    }

    public static int reverseInt(int n){
        int x = 0;
        while (n > 0){
            x = (x * 10 + (n % 10));
            n /= 10;
        }

        return x;
    }
    }


