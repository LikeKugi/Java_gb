package org.example;

/*
API string
concat(): объединение
valueOf(): преобразует Object в строковое представление (завязан на toString())
join(): объединяет набор строк в одну с учетом разделителя
charAt(): получение символа по индексу
indexOf(): первый индекс вхождения подстроки
lastIndexOf(): последний индекс вхождения подстроки
startsWith()/endsWith(): определяет, начинается/заканчивается ли строка с подстроки
replace(): замена одной подстроки на другую
trim(): удаляет начальные и конечные пробелы
substring(): возвращает подстроку, см.аргументы
toLowerCase()/toUpperCase(): возвращает новую строку в нижнем/верхнем регистре
сompareTo(): сравнивает две строки
equals(): сравнивает строки с учетом регистра
equalsIgnoreCase(): сравнивает строки без учета регистра
regionMatches(): сравнивает подстроки в строках
 */


public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        CreateString();
    }
    /**
     * create 1_000_000 '+' string
     **/
    public static void CreateString() {
        StringBuilder sb = new StringBuilder();
        sb.append("+".repeat(1_000_000));
        System.out.println(sb);
    }
}