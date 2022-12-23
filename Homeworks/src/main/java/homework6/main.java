package homework6;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class main {

    public static void main(String[] args) {
        Set<Laptop> laptops = new HashSet<>();

        laptops.add(new Laptop("Xiaomi RedmiBook 15 JYU4525RU", 256, "Windows 11 Домашняя"));

        laptops.add(new Laptop("ASUS VivoBook 14 F415EA-UB34", 128, "Windows 10 Домашняя S-режим"));

        laptops.add(new Laptop("HP 15-dy2067ms 4W2K2UA", 256, "Windows 11 Домашняя S-режим"));

        laptops.add(new Laptop("HUAWEI MateBook D 15 BoM-WFQ9 5500U/16+512 Mystic Silver", 512, "Windows 11 Домашняя"));

        laptops.add(new Laptop("Thunderobot 911 Air D (JT0098E06RU)", 256, "не установлена"));

        System.out.println("===== Первый фильтр =====");
        Map<Object, Set<Laptop>> filteredLaptops = Laptop.filterByProperty(laptops);
        print(filteredLaptops);

        System.out.println("===== Второй фильтр =====");
        Map<Object, Set<Laptop>> filteredLaptops2 = Laptop.filterByMinValue(laptops);
        print(filteredLaptops2);
    }

    private static void print(Map<Object, Set<Laptop>> map) {
        for (Map.Entry<Object, Set<Laptop>> entry : map.entrySet()) {
            System.out.println(entry);
            System.out.println();
        }
    }
}
