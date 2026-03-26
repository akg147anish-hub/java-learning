public class LongestWord {
    public static void main(String[] args) {
        String str = "Java programming is powerful";

        String[] words = str.split(" ");
        String longest = "";

        for(String word : words) {
            if(word.length() > longest.length()) {
                longest = word;
            }
        }

        System.out.println("Longest word: " + longest);
    }
}
