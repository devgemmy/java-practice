import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Question4 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("/Users/macbookair/Documents/BRUNEL/YEAR 1/Programming Applications/examquestion4.txt");
        BufferedReader br = new BufferedReader(fr);

        Map<String, Integer> wordCountMap = new HashMap<>();
        try {
            String lines;
            while ((lines = br.readLine()) != null) {
                // System.out.println(lines);
                lines = lines.toLowerCase().trim();
                if (lines.isEmpty()) continue;

                String[] words = lines.split(" ");
                for (String word : words) {
                    word = word.toLowerCase().trim();
                    wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
                }
            }
            for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        } catch (IOException e) { e.printStackTrace(); }

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