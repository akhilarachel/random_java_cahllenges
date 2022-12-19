public class Principal {

    public static void main (String[] args) {
        double number = 123.4567;
        int decimal = 3;
        double temp = number;
        for (int i = 0; i < decimal; i++){
            temp = temp * 10;
            System.out.println(temp);
        }
        double rem = temp % 10;
        System.out.println(rem);
        int digit = (int) temp;
        System.out.println(digit);

        if (rem >= 5){
            digit = digit + 1;
        }
        System.out.println(digit);
        double result = (double) digit;
        System.out.println(result);
        for (int i = 0; i < decimal; i++) {
            result = Math.round(result) / 10;
            System.out.println(result);
        }

/*        String s = String.format("%.2f", result);
        double val = Double.parseDouble(s);
        System.out.println(val);


        if (decimal < 0) throw new IllegalArgumentException();

        BigDecimal bd = new BigDecimal(Double.toString(number));
        bd = bd.setScale(decimal, RoundingMode.HALF_UP);
        System.out.println(bd.doubleValue()); */


        double scale = Math.pow(10, decimal);
        System.out.println(scale);
        System.out.println(Math.round(number * scale) / scale);
    }
}
