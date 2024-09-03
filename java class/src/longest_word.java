public class longest_word {
    public static void main(String[] args) {
        String[] words = new String[]{"sun", "moon", "stars", "galaxy"};
        
        String longestWord = "";
        
        // Iterate through the array to find the longest word
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        // Display the longest word
        System.out.println("Longest Word: " + longestWord);
    }
}
