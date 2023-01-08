public class Operations {

    public static int add(int a, int b) {
        int sum = a+ b;

        return sum;
    }

    public static double multiply(int a, int b) {

        double multiplication = a * b;

        return multiplication;
    }

    public static int subtract(int a, int b) {

        int minus = 0;

        if(a > b) {
            minus = a - b;
        }else {
            minus = b - a;
        }

        return minus;
    }

    public static int getNegativeNumber(int a, int b) {

        int minus = 0;

        if(a < b) {
            minus = a - b;
        }else {
            minus = b - a;
        }

        return minus;
    }

    public static int divide(int a, int b){
        int z = 0;
        if (a != 0 && b !=0){
            z = a/b;
        }
        return z;
    }

    public static int minus(int a, int b) {
        int result = a - b;

        return result;
    }
}
