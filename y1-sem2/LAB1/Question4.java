import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
//import java.util.HashSet;

public class Question4 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("/Users/macbookair/Documents/BRUNEL/YEAR 1/Programming Applications/examquestion4.txt");
        BufferedReader br = new BufferedReader(fr);

        int wordCount = 0;

        String lines = null;
        // br.lines().forEach(System.out::println);
        while ((lines = br.readLine()) != null) {
            System.out.println(lines.toLowerCase());
            String[] words = lines.split(" ");

//            for (int i = 0; i < words.length; i++) {
//                if (Objects.equals(words[i], words[i + 1])) {
//                    wordCount++;
//                }
//            }

            // System.out.println(wordCount);

        }

        // System.out.println(words.length);

        br.close();
        fr.close();
    }
}



//
//public class Main {
//
//    private static class Pair<Integer, String, Double> {
//        private final Integer id;
//        private final String name;
//        private final Double price;
//
//        public Pair(Integer id, String name, Double price) {
//            this.id = id;
//            this.name = name;
//            this.price = price;
//        }
//
//        public Integer getID() {
//            return id;
//        }
//
//        public String getName() {
//            return name;
//        }
//
//        public Double getPrice() {
//            return name;
//        }
//    }
//
//    public static void main(String[] args) {
//
//
//
//        Pair<Integer, String, Double> details = new Pair<Integer, String, Double>(900, "Dinah", 50.78);
//
//
//        System.out.println(details.getID() + details.getName() + details.getPrice());
//
//    }
//}