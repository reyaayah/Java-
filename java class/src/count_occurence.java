public class count_occurence {
    public static void main(String[] args) {
        String[] str = new String[]{"apple", "banana", "apple", "orange", "banana", "apple"};
        
        boolean[] visited = new boolean[str.length];

        System.out.println("Word Count:");
        for (int i = 0; i < str.length; i++) {
            if (visited[i]) {
                continue;
            }

            int count = 1;
            for (int j = i + 1; j < str.length; j++) {
                if (str[i].equals(str[j])) {
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(str[i] + ": " + count);
        }
    }
}
