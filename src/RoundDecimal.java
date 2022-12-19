public class RoundDecimal {

    public static void main (String[] args) {
        double num = 3.14159265358979323846264338327950288419716939937510;
        int decimalPoints = 2;
        double result = round(num, decimalPoints);
        System.out.println(result); // prints 3.14
    }

    public static double round (double value, int decimalPoints) {
        double scale = Math.pow(10, decimalPoints);
        return Math.round(value * scale) / scale;

    }
}
