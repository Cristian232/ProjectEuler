package Pe1;
//If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
// The sum of these multiples is 23.
//Find the sum of all the multiples of 3 or 5 below 1000.

public class Main {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i <= 1000 ; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                count++;
            }
        }
        int[] nrList = new int[count];
        for (int i = 0; i < 1000 ; i++) {
            if (i%3==0 || i%5==0){
                nrList[count-1]=i;
                count--;
            }
        }
        int sum = 0;
        for (int i = 0; i < nrList.length ; i++) {
            sum+=nrList[i];
        }
//        for (int x:nrList) {
//            System.out.println(x);
//        }
        System.out.println(sum);
    }
}
