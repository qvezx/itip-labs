import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindStartsWith {
    public static void main(String[] args) {
        String text = "hello world hi hdadaf adshdf";

        Pattern pattern = Pattern.compile("\\w*h\\w*");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}

// Текст: "hello world hi"
//         ↑
// Шаг 1: Ищет 'h' → находит в позиции 0: "h"
// Шаг 2: `\\s*` - ищет 0 или больше пробелов → после "h" идет "e" (не пробел) = 0 пробелов
// Шаг 3: `(\\w+)` - захватывает буквы до пробела → "ello"
// Результат: "hello"

// Продолжает поиск с позиции 5: " world hi"
//               ↑
// Шаг 1: Ищет 'h' → находит в позиции 11: "h"  
// Шаг 2: `\\s*` - перед "h" пробелы? Да, но `\\s*` после "h" → после "h" идет "i" = 0 пробелов
// Шаг 3: `(\\w+)` - захватывает "i"
// Результат: "hi"