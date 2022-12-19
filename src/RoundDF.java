import java.text.DecimalFormat;

public class RoundDF {

    public static void main (String[] args) {

        double num = 3.14159265358979323846264338327950288419716939937510;
        int decimalPoints = 2;
        String pattern = "#.";
        for (int i = 0; i < decimalPoints; i++) {
            pattern += "#";
        }
        DecimalFormat df = new DecimalFormat(pattern);
        double result = Double.parseDouble(df.format(num));
        System.out.println(result); // prints 3.14
    }
}
