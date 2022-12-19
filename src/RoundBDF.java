import java.math.BigDecimal;
import java.math.RoundingMode;

public class RoundBDF {
    public static void main(String[] args) {
        double num = 3.14159265358979323846264338327950288419716939937510;
        int decimalPoints = 2;
        BigDecimal bd = new BigDecimal(num).setScale(decimalPoints, RoundingMode.HALF_UP);
        double result = bd.doubleValue();
        System.out.println(result); // prints 3.14
    }
}
