import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindStartsWith {
    public static void main(String[] args) {
        String text = "hello world hi";

        // Находит букву h, за которой следуют пробельные символы (0 или больше) и затем слово
        Pattern pattern = Pattern.compile("h\\s*(\\w+)");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}