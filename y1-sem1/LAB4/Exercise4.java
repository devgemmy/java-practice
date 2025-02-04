import java.text.DecimalFormat;

public class Exercise4 {

    public static void main(String[] args) {
        System.out.println("Lab 4 - Exercise 4 \n");

        double x = 123.456, y = 17.0 / 3.0, z = Math.sqrt(2);
        String a = "Hello", b = "World";

        DecimalFormat dformat = new DecimalFormat("#.###");
        dformat.format(y);
        // String f = String.format("y = %1$.5f", y);
        // System.out.println(f);

        // a)
        System.out.println(y);
        System.out.println(dformat.format(y));

        // b) x
        System.out.println("Digits in x before and after the decimal point");
        String xx = Double.toString(x);
        String[] xArray = xx.split("[.]");
        for (int i = 0; i < xArray.length; i++) {
            System.out.println(xArray[i].length() + " digits");
        }
        System.out.println();

        // b) y
        System.out.println("Digits in y before and after the decimal point");
        String yy = Double.toString(y);
        String[] yArray = yy.split("[.]");
        for (int i = 0; i < yArray.length; i++) {
            System.out.println(yArray[i].length() + " digits");
        }
        System.out.println();

        // b) z
        System.out.println("Digits in z before and after the decimal point");
        String zz = Double.toString(z);
        String[] zArray = zz.split("[.]");
        for (int i = 0; i < zArray.length; i++) {
            System.out.println(zArray[i].length() + " digits");
        }
        System.out.println();

        // c) and d)

        String ar = "";
        // use reverse string
        System.out.println(a.length());
        for (int i = a.length() - 1; i >= 0; i--) {
            char ch = a.charAt(i);
            ar += ch;
        }

        String c = ar + " " + b;

        System.out.println(c);
        System.out.println(c.replace("ll", "ppp"));
    }

}
