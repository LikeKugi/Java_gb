package org.example;

/* 1. Вычислить [n-ое треугольного число]()(сумма чисел от 1 до n), n! (произведение чисел от 1 до n) 5! =1
 *
 * 2. Вывести все простые числа от 1 до 1000
 *
 * 3. Реализовать простой калькулятор
 *
 * 4. *+Задано уравнение вида q + w = e, q, w, e >= 0.
 * Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69.
 * Требуется восстановить выражение до верного равенства.
 * Предложить хотя бы одно решение или сообщить, что его нет.

 */

import java.util.Scanner;


public class Homework1 {
    /**
     * Реализовать простой калькулятор
     */
    private static void calculateString(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 1 value: ");
        int firstValue = in.nextInt();
        System.out.print("Enter 2 value: ");
        int secondValue = in.nextInt();
        System.out.print("Input operator: ");
        String operator = in.next();

        in.close();


        switch (operator) {
            case "/" -> {
                if (secondValue != 0) {
                    System.out.println(firstValue / secondValue);
                } else {
                    System.out.println("Not supported division by zero");
                }
            }
            case "*" -> System.out.println(firstValue * secondValue);
            case "-" -> System.out.println(firstValue - secondValue);
            case "+" -> System.out.println(firstValue + secondValue);
            default -> System.out.println("can't count");
        }
    }

    /**
     * Вывести все простые числа от 1 до 1000
     **/
    private static boolean isPrime(int n) {
        if (n == 2 || n == 3) {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0 || n == 1) {
            return false;
        }
        for (int i = 1; i < (n / 6)+1; i++) {
            int modMinus = n % (6*i-1);
            if (modMinus == 0 && (6*i-1) != n){
                return false;
            }
            int modPlus = n % (6*i+1);
            if (modPlus == 0 && (6*i+1) != n){
                return false;
            }
        }
        return true;
    }

    private static void primeNumbers() {
        int max_value = 1000;
        System.out.println("All prime numbers in range [1; 1000]");
        for (int i = 0; i < max_value + 1; i++) {
            if (isPrime(i)) {
                System.out.printf("%d ", i);
            }
        }
    }

    /**
     * Вычислить [n-ое треугольного число]()(сумма чисел от 1 до n), n! (произведение чисел от 1 до n) 5! =1
     * 1 : 1
     * 2 : 1 + 2 = 3
     * 3: 1 + 2 + 3 = 6
     * 4: 1 + 2 + 3 + 4 = 10
     * 5: 1 + 2 + 3 + 4 + 5 = 15
     * ...
     **/
    private static void triangleNumber() {
        System.out.println("Count nth triangle number");
        var number = getIntNumber();

        int nNumber = number * (number + 1) / 2;
        System.out.printf("Number is %d", nNumber);


    }

    public static void main(String[] args) {

        calculateString();
        primeNumbers();
        triangleNumber();

    }

    private static int getIntNumber() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter int number: ");
        System.out.print(in.nextLine());
        int number = in.nextInt();
        in.close();
        return number;
    }
}

