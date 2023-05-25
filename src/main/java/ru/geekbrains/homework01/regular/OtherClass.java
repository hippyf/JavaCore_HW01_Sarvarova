package ru.geekbrains.homework01.regular;

/**
 * Другие операции с числами
 */
public class OtherClass {
    /**
     * Функция определения остатка от деления
     * @param a делимое
     * @param b делитель
     * @return остаток от деления
     */
    public static int rem (int a, int b) {
        return a % b;
    }

    /**
     * Функция возведения в степень
     * @param a исходное число
     * @param b степень
     * @return
     */
    public static  int pow (int a, int b) {
        return  (int) Math.pow(a, b);
    }


}
