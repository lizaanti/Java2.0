import java.util.ArrayList;
import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) throws WeakPasswordException {
        maxNum(-4, -4);
        calculatorDividingNumbers(-4, 0);
        stringToNumberConverter("1234ggfd");
        ageVerification(200);
        findSqrt(-5);
        factorial(-1);
        zeroInMass();
        exponentNum(2, -1);
        checkingTheDivisibility(6, 0);
        checkPassword("12345678");
        trimmingALine("123", 4);
        findingAnElementInArray(new int[]{1, 2, 3, 4, 5}, 10);
        conversionToBinarySystem(-8);
        returnsTheListElementByIndex(3);
        stringConcatenation("123", "");
        remainderOfDivision(4, 0);
        squareRootOfANumber(-4);
        celsiusToFahrenheit(-25);
        checkingForNull("");
    }

    //Задача 1. Функция для нахождения максимума
    public static void maxNum(int fNum, int sNum) {

        if (fNum > sNum) {
            System.out.println(fNum);
        }
        if (sNum > fNum) {
            System.out.println(sNum);
        }
        if (fNum == sNum) throw new ArithmeticException("Числа равны");
    }

    //Задача 2. Калькулятор деления
    public static void calculatorDividingNumbers(int fNum, int sNum) {
        try {
            System.out.println(fNum / sNum);
        } catch (ArithmeticException e) {
            throw new ArithmeticException("На ноль делить нельзя");
        }
    }

    //Задача 3. Конверт строк в числа
    public static void stringToNumberConverter(String str) {
        try {
            int num = Integer.parseInt(str); //метод принимает строку в качестве аргумента и возвращает целое число
            System.out.println(num);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Невозможно конвентировать строку");
        }
    }

    //Задача 4. Проверка возраста
    public static void ageVerification(int age) {

        if (age < 0 || age > 150) throw new IllegalArgumentException("Недопустимый возраст");

    }

    //Задача 5. Нахождение корня
    public static void findSqrt(int num) {
        double temp;
        temp = Math.sqrt(num);
        System.out.println(temp);
        if (num < 0) throw new IllegalArgumentException("Число меньше нуля");

    }

    //Задача 6. Факториал
    public static void factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        System.out.println(fact);
        if (num < 0) throw new ArithmeticException("Число отрицательное");
    }

    //Задача 7. Проверка массива на нули
    public static void zeroInMass() {
        int[] mass = {1, 2, 3, 0};
        for (int i = 0; i < 4; i++) {
            if (mass[i] == 0) throw new ArithmeticException("В массиве есть нули");
        }
    }

    //Задача 8. Калькулятор возведения в степень
    public static void exponentNum(int num, int numPow) {
        double temp = 0;

        temp = Math.pow(num, numPow);
        System.out.println(temp);
        if (numPow < 0) throw new ArithmeticException("Cтепень отрицательная");
    }

    //Задача 9. Обрезка строки
    public static void trimmingALine(String str, int num) {
        try {
            String resultString = str.substring(num);
            System.out.println(resultString);
        } catch (StringIndexOutOfBoundsException e) {
            throw new RuntimeException("Строка слишком коротка");
        }
    }

    //Задача 10. Поиск элемента в массиве
    public static int findingAnElementInArray(int[] arr, int necessaryElement) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == necessaryElement) {
                System.out.println("Элемент найден");
                return i;
            }
        }
        throw new ArrayIndexOutOfBoundsException("Not find element");
    }

//Задача 11. Конвертация в двоичную систему
        public static void conversionToBinarySystem ( int num){
            if (num < 0) throw new IllegalArgumentException("Число отрицательное");
            int b;
            String temp = "";
            while (num != 0) {
                b = num % 2;
                temp = b + temp;
                num = num / 2;
            }
            System.out.print(temp);
        }

//Задача 12. Проверка делимости
        public static void checkingTheDivisibility ( int fNum, int sNum){
            if (fNum % sNum == 0) {
                System.out.println("Числа делятся друг на друга");
            } else {
                System.out.println("Числа не делятся друг на друга");
            }
            if (sNum == 0) throw new ArithmeticException("Делитель равень нулю");

        }

//Задача 13. Чтение элемента списка
public static void returnsTheListElementByIndex(int index) {
    try {
        ArrayList<String> array = new ArrayList<>(Arrays.asList("1", "2", "3"));
        System.out.println(array.get(index));
    } catch (IndexOutOfBoundsException e) {
        throw new IndexOutOfBoundsException("Выход за пределы массива");
    }
}

//Задача 14. Парольная проверка
public static void checkPassword(String pass) throws WeakPasswordException {
    if (pass.length() < 8) {
        throw new WeakPasswordException("Пароль ненадежный");
    }
}

//Задача 15. Проверка даты
        public static void checkDate (String date){
        }

//Задача 16. Конкатенация строк
public static void stringConcatenation(String fStr, String sStr) {
    System.out.println(fStr + sStr);
    if (fStr.isEmpty() || sStr.isEmpty()) throw new NullPointerException("Одна из строк равна null");


}

//Задача 17. Остаток от деления
        public static void remainderOfDivision ( int fNum, int sNum){
            System.out.println(fNum % sNum);
            if (sNum == 0) throw new ArithmeticException("Второе число равно нулю");
        }

//Задача 18. Квадратный корень
        public static void squareRootOfANumber ( int num){
            System.out.println(Math.pow(num, 0.5));
            if (num < 0) throw new IllegalArgumentException("Число меньше нуля");
        }

//Задача 19. Конвертер температуры
        public static void celsiusToFahrenheit ( int c){
            double f = ((c * 9) / 5) + 32;
            if (f < 0) throw new ArithmeticException("Меньше нуля");
            System.out.println(f);
        }

//Задача 20. Проверка строки на пустоту
        public static void checkingForNull (String str){
            if (str.isEmpty()) throw new NullPointerException("Строка пуста");
        }
    }

//Собственное исключение
class WeakPasswordException extends Exception {
    public WeakPasswordException(String message) {
        super(message);
    }
}

