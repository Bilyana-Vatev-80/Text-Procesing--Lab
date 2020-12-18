import java.util.*;

public class Reverse1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String words = scanner.nextLine();


        while (!words.equals("end")) {
            String reverse = reverseList(words);

            System.out.printf("%s = %s%n", words, reverse);
            words = scanner.nextLine();
        }
    }

    private static String reverseList(String words) {
        List<String> result = new ArrayList<>();

        for (int i = 0; i < words.length(); i++) {
            result.add("" + words.charAt(i));
        }
        Collections.reverse(result);

        return String.join("", result);
    }
}
