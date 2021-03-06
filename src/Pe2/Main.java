package Pe2;
//Each new term in the Fibonacci sequence is generated by adding the previous two terms.
// By starting with 1 and 2, the first 10 terms will be:
//        1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
//        By considering the terms in the Fibonacci sequence whose values do not exceed four million,
// find the sum of the even-valued terms.
public class Main {
    public static void main(String[] args) {
        int count = 0 ;
        int x = 0;
        int y = 1;
        int z ;
        while(x<4000000){
            z = x + y;
            x = y;
            y = z;
            if (y%2==0){
                count++;
            }
        }
        int[] v = new int[count];
        x = 0;
        y = 1;
        while(x<4000000){
            z = x + y;
            x = y;
            y = z;
            if (y%2==0){
                v[count-1] = y;
                count--;
            }
        }
        long sum = 0;
        for (int i = 0; i <v.length ; i++) {
            sum += v[i];
        }

        System.out.println(sum);
    }
}
