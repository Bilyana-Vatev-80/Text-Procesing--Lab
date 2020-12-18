import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RepeatStrings_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String words = scanner.nextLine();
        String text = scanner.nextLine();

        
        while (text.contains(words)) {
            text = text.replace(words, "");
        }
        System.out.println(text);
    }
}
