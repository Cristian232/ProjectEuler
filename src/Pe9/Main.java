package Pe9;
//A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
//
//        a^2 + b^2 = c^2
//        For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
//
//        There exists exactly one Pythagorean triplet for which a + b + c = 1000.
//        Find the product abc.
public class Main {
    public static void main(String[] args) {
        show(testNr());
    }

    public static boolean isPyTriplet(int a,int b,int c){
        boolean x = false;
        if ((a<b)&&(b<c)) {
            if( (Math.pow(c,2))==( Math.pow(a,2) + Math.pow(b,2)) ){
                return true;
            }

        }
        return x;
    }

    public static int[] testNr(){
        int[] x = new int[3];
        for (int i = 1; i < 1000 ; i++) {
            for (int j = 1; j < 1000 ; j++) {
                for (int k = 1; k < 1000 ; k++) {
                    if (((i+j+k) == 1000) && (isPyTriplet(i,j,k))){
                        x[0] = i;
                        x[1] = j;
                        x[2] = k;
                        return x;
                    }
                }
            }
        }



        return x;
    }

    public static void show(int[] x){
        for (Integer n:x) {
            System.out.println(n);
        }
    }
}
