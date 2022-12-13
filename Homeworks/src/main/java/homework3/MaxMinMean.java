package homework3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class MaxMinMean {
    /**
     * Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
     * */
    public static void main(String[] args) {
        findMaxMinMean();
    }

    private static void findMaxMinMean(){
        List<Integer> array = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            Random random = new Random();
            int val = random.nextInt(30);
            array.add(val);
        }
        System.out.println(array);
        Collections.sort(array);
        System.out.println(array.get(0));
        System.out.println(array.get(array.size()-1));
        System.out.println(array.get(array.size()/2));
    }
}
