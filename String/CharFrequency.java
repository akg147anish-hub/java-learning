public class CharFrequency {
    public static void main(String[] args) {
        String str = "programming";

        for(int i = 0; i < str.length(); i++) {
            int count = 1;

            if(str.charAt(i) == ' ') continue;

            for(int j = i+1; j < str.length(); j++) {
                if(str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }

            System.out.println(str.charAt(i) + " : " + count);
        }
    }
}
