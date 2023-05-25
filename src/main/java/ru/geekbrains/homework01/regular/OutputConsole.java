package ru.geekbrains.homework01.regular;

/**
 * Вывод значения в консоль
 */
public class OutputConsole {
    /**
     * Выводит значение
     * @param a число, которое нужно вывести в консоль
     * @return
     */
    public static String output (int a) {
        return String.format("Итоговое число: %d.", a);
    }
}
