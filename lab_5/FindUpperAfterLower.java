import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindUpperAfterLower {

    public static void main(String[] args) {

        String text = "asdsada dasd aADdsads asdaSds";

        Pattern pattern = Pattern.compile("([a-z])([A-Z])");
        Matcher matcher = pattern.matcher(text);

        String result = matcher.replaceAll("!$1$2!");
        System.out.println(result);
    }
}

// Текст: "aADdsads asdaSds"
//         ↑
// Шаг 1: `([a-z])` - находит строчную "a" (запоминает как группу 1)
// Шаг 2: `([A-Z])` - следующая буква "A" - заглавная (запоминает как группу 2)
// Найдено: "aA" → заменяется на "!aA!"

// Продолжает: "Ddsads asdaSds"
//             ↑
// Шаг 1: "D" - не строчная, пропускаем
// Шаг 2: "d" - строчная, но следующая "s" - не заглавная, пропускаем
// ...
// Шаг N: "aS" → "a" (строчная) + "S" (заглавная) = замена на "!aS!"