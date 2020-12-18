import java.util.Scanner;

public class E1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String words = scanner.nextLine();


        while (!words.equals("end")) {
            String reverse = reverse(words);

            System.out.printf("%s = %s%n", words, reverse);
            words = scanner.nextLine();
        }

    }

    private static String reverse(String words) {
        String result = "";

        for (int i = words.length() - 1; i >= 0; i--) {
            result += words.charAt(i);
        }
        return result;
    }
}
