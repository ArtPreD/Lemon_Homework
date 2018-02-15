# Lemon_Homework
School Tasks

План:
1. Архитектура
2. Поведение системы
3. Implimentation
4. UI/Swing
5. Сетевая игра

КРЕСТИКИ НОЛИКИ

1. Поле 3 на 3
2. Фишки: "Х" - "О"
3. Условие выигрыша - 8 комбинаций.
4. Учет ходов.


public class Reflection {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        final String hello = "hello";

        Field value = String.class.getDeclaredField("value");
        value.setAccessible(true);
        value.set(hello, "Накуся выкуси".toCharArray());

        System.out.println(hello);
    }
}
