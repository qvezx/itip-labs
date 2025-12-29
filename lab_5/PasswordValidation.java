import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidation {
    public static void main(String[] args) {

        String password = "12345Aaa";
        
        Pattern pattern = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8,16}$"); // Точка здесь — шаблон для любого символа
        Matcher matcher = pattern.matcher(password);

        System.out.println(matcher.matches());

    }
}

// Проверка 1: (?=.*[0-9]) - есть ли цифра?
// Смотрит вперед: .*[0-9] - любые символы потом цифра
// Находит "12345Aaa" → есть цифры "1","2","3"...


// Проверка 2: (?=.*[a-z]) - есть ли строчная буква?
// Смотрит вперед: находит строчные "a","a"


// Проверка 3: (?=.*[A-Z]) - есть ли заглавная буква?
// Смотрит вперед: находит "A"

// Проверка 4: .{8,16} - длина от 8 до 16
// "12345Aaa" = 8 символов
