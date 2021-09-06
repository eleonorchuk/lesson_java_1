import java.lang.System;
import java.util.Random;

public class HomeWorkApp {
    public static void main(String[] args) {
        hello();
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    static void hello() {
        System.out.println("Hello world");
    }

    static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    static void checkSumSign() {
        Random random = new Random();
        int a = random.nextInt();
        int b = random.nextInt();
        int res = a + b;

        System.out.println("res = " + a + " + " + b + " = " + res);
        System.out.print("Сумма ");

        if (res >= 0)
            System.out.println("положительная");
        else
            System.out.println("отрицательная");
    }

    static void printColor() {
        Random random = new Random();
        int value = random.nextInt();

        System.out.println("value = " + value);

        if (value <= 0)
            System.out.println("Красный");
        else if (value <= 100)
            System.out.println("Желтый");
        else
            System.out.println("Зеленый");
    }
    static void compareNumbers() {
        Random random = new Random();
        int a = random.nextInt();
        int b = random.nextInt();
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        if (a >= b)
            System.out.println("a >= b");
        else
            System.out.println("a < b");
    }
}





