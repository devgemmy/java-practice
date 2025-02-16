import java.util.*;

public class Methods {

    public static void main(String[] args) {
        // String Methods
        String fullName = "My name is Dieumabeni, Ronelle, Ranyerechi, Tonneau";

        System.out.println(fullName.charAt(11));
        System.out.println(fullName.compareTo("My name is Tonneau")); // I don't understand.
        System.out.println(fullName.length());
        System.out.println("My name is Tonneau".length());
        System.out.println(fullName.replace("Dieumabeni", "Salouange"));
        System.out.println(fullName.replaceAll("e", "0"));

        String[] splitting = fullName.split(",");
        System.out.println(splitting.length);
        System.out.println(splitting[0]);
        System.out.println(fullName.substring(11, 21));
        System.out.println(fullName.toLowerCase());
        System.out.println(fullName.toUpperCase());
        System.out.println(String.valueOf(90));

        System.out.println(fullName.contains("elle"));

        String greet = "Hello", name = "Stephanie";
        name = name.replace(name, "Sophie");
        System.out.println(greet + " " + name);

        String d = "desserts";
        String s = "";

        for (int b = d.length() - 1; b >= 0; b--) {
            char c = d.charAt(b);
            s = s + c;
        }

        System.out.println(s);

        // Mathematical Methods
        double g = -9.4854;
        int h = 18;
        System.out.println(Math.PI * g);
        System.out.println(Math.E * g);
        System.out.println(Math.abs(g));
        System.out.println(Math.ceil(g));
        System.out.println(Math.floor(g));
        System.out.println(Math.round(g));
        System.out.println(Math.round(g));

        System.out.println(Math.min(g, h));
        System.out.println(Math.max(g, h));
        System.out.println(Math.pow(45, 3));
        System.out.println(Math.sqrt(50 + 7 + 8 + 9));
        System.out.println(Math.cbrt(64));

        Random randy = new Random();
        System.out.println(randy.nextInt());

        for (int j = 0; j < 5; j++) {
            System.out.println(randy.nextInt());
        }
        System.out.println("=========");

        Random myRandGen = new Random();
        System.out.println(myRandGen.nextInt(8 - 3 + 1 + 3)); // 3 - 8 // max-min+1+min

        int min = 3;
        int max = 8;
        int range = max - min + 1;

        for (int j = 0; j < 5; j++) {
            int rand = (int) (Math.random() * range) + min;
            System.out.println(rand);
        }
    }

}
