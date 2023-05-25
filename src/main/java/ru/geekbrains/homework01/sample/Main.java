package ru.geekbrains.homework01.sample;

import ru.geekbrains.homework01.regular.OtherClass;
import ru.geekbrains.homework01.regular.OutputConsole;

public class Main {
    public static void main(String[] args) {
        int result = OtherClass.pow(5,2);
        System.out.println(OutputConsole.output(result));
        result = OtherClass.rem(5, 2);
        System.out.println(OutputConsole.output(result));

    }
}