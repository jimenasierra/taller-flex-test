public class TallerTest {

    public static void main(String[] args) {

        String word = "wegeeksskeegyuwe";
        getLongestPalindromic(word);

    }
    private static void getLongestPalindromic(String word) {
        String longest = "";
        for (int i = 0; i < word.length(); i++) {
            String subString = word.substring(i);
            longest = compareSubstring(subString, word, longest);
        }
        System.out.println("Word: " + word);
        System.out.println("Longest palindromic: " + longest);
        System.out.println("Length: " + longest.length());
    }

    private static String compareSubstring(String subString, String word, String longest) {
        StringBuilder toCompare = new StringBuilder();
        int length = longest.length();
        for (int i = 0; i < subString.length(); i++) {

            toCompare.append(subString, i, i + 1);
            StringBuilder reverseSubString = new StringBuilder(toCompare);
            reverseSubString.reverse();

            if (word.contains(reverseSubString)) {
                if (reverseSubString.length() > length) {
                    length = reverseSubString.length();
                    longest = reverseSubString.toString();
                }
            }
        }
        return longest;
    }

}