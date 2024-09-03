import java.util.ArrayList;

public class question_three {
    public static void main(String[] args) {
        String[] str = new String[]{"a", "b", "c", "a", "a", "d", "c", "f"};
        
        // ArrayList to store repeated and non-repeated words
        ArrayList<String> repeatedWords = new ArrayList<>();
        ArrayList<String> nonRepeatedWords = new ArrayList<>();

        // Iterate through the array to find repeated words
        for (int i = 0; i < str.length; i++) {
            int count = 0;
            for (int j = 0; j < str.length; j++) {
                if (str[i].equals(str[j])) {
                    count++;
                }
            }
            // If count > 1 and word is not already in repeatedWords, add it
            if (count > 1 && !repeatedWords.contains(str[i])) {
                repeatedWords.add(str[i]);
            }
            // If count == 1, add it to nonRepeatedWords
            if (count == 1) {
                nonRepeatedWords.add(str[i]);
            }
        }

        // Display repeated words
        System.out.println("Repeated Words:");
        for (String word : repeatedWords) {
            System.out.println(word);
        }

        // Display non-repeated words
        System.out.println("\nNon-Repeated Words:");
        for (String word : nonRepeatedWords) {
            System.out.println(word);
        }

        // Remove repeated words
        ArrayList<String> result = new ArrayList<>();
        for (String word : str) {
            if (!repeatedWords.contains(word)) {
                result.add(word);
            }
        }

        // Display the array after removing repeated words
        System.out.println("\nArray After Removing Repeated Words:");
        for (String word : result) {
            System.out.print(word + " ");
        }
    }
}
