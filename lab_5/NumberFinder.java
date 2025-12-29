import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberFinder {
    public static void main(String[] args) {
        String text = "a4 123.23 45 is number";

        Pattern pattern = Pattern.compile("\\b\\d+(?:\\.\\d+)?\\b"); // означает буквальный символ точки
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}

// \\b - перед "1": пробел|1 → есть граница 
// \\d+ - находит "123" (три цифры) 
// (?:\\.\\d+)? - проверяет десятичную часть:
// Следующий символ "." 
// \\. - находит "." 
// \\d+ - находит "23" 
// \\b - после "3": 3|пробел → есть граница