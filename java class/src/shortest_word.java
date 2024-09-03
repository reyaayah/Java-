public class shortest_word {
    public static void main(String[] args) {
        String[] words = new String[]{"apple", "banana", "cat", "orange"};
        // Initialize shortestWord with the first word in the array
        String shortestWord = words[0];
        
        for (String word : words) {
            if (word.length() < shortestWord.length()) {
                shortestWord = word;
            }
        }
        System.out.println("Shortest Word: " + shortestWord);
    }
}
