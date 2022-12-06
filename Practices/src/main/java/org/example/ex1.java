package org.example;

import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Arrays;
import java.util.Scanner;
/*
 * ex1: запросить имя - вывести в консоль
 */

/*
* В консоли запросить имя пользователя. В зависимости от текущего времени, вывести приветствие вида
*
"Доброе утро, <Имя>!", если время от 05:00 до 11:59

"Добрый день, <Имя>!", если время от 12:00 до 17:59;

"Добрый вечер, <Имя>!", если время от 18:00 до 22:59;

"Доброй ночи, <Имя>!", если время от 23:00 до 4:59

 */

/*
Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1.
 */
public class ex1 {

    /**
     * Во фразе "Добро пожаловать на курс по Java" переставить слова в обратном порядке.
     **/
    public static void reversePhrase(){
        String phrase = "Добро пожаловать на курс по Java";
        String[] convertedPhraseList = phrase.split(" ");
        for (int i = 0; i < convertedPhraseList.length; i++) {
            System.out.printf("%s ", convertedPhraseList[convertedPhraseList.length - i - 1]);

        }
    }

    /**
     * Напишите метод, который находит самую длинную строку общего префикса среди массива строк.
     * *  Если общего префикса нет, вернуть пустую строку "".
     **/
    public static void longestCommonPrefix() {
        String[] words = {"Hello", "HelJava", "HelWorld"};
        if (words.length == 0) {
            System.out.println("");
        }
        String prefix = words[0];

        for (int i = 1; i < words.length; i++) {
            while (words[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        System.out.println(prefix);
    }

    /**
     * * Дан массив nums = [3,2,2,3] и число val = 3.
     * * Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
     * * Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного
     * * , а остальные - равны ему.
     *
     * @return int[]
     **/
    public static int[] arrChangeToEnd() {
        int[] arr = {3, 2, 2, 3};
        int value = 3;
        int buffer = 0;
        int j = arr.length - 1;
        for (int i = 0; i < j; i++) {
            if (arr[i] == value) {
                buffer = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = buffer;
            }
        }
        return arr;
    }

    private static int[] CreateArray() {
        return new int[]{1, 1, 1, 1, 1, 0, 1, 1, 1};
    }

    private static int CountOnesInArray() {
        var arr = CreateArray();
        var counter = 0;
        var maxOnes = 0;

        for (int j : arr) {
            if (j == 1) {
                counter++;
            } else {
                counter = 0;
            }
            if (counter > maxOnes) {
                maxOnes = counter;
            }
        }

        return maxOnes;
    }

    private static LocalTime GetCurrentTime() {
        return LocalTime.now(ZoneId.systemDefault());
    }

    private static void PrintGreeting() {

        LocalTime time = GetCurrentTime();
        String name = GetName();
        int state = 0;

        switch (state) {
            case 1 -> System.out.printf("Доброе утро, %s! \n", name);
            case 2 -> System.out.printf("Добрый день, %s \n", name);
            case 3 -> System.out.printf("Добрый вечер, %s! \n", name);
            case 4 -> System.out.printf("Доброй ночи, %s! \n", name);
        }

    }

    private static String GetName() {
        Scanner in = new Scanner(System.in);
        System.out.print("What's your name: ");
        String name = in.nextLine();
        in.close();
        return name;
    }

    private static void HelloName(String name) {
        System.out.printf("Hello, %s \n", name);
    }

    public static void main(String[] args) {
        var name = GetName();
        HelloName(name);
        var counts = CountOnesInArray();
        System.out.println(counts);

        System.out.println(Arrays.toString(arrChangeToEnd()));
        longestCommonPrefix();
        reversePhrase();
    }
}
