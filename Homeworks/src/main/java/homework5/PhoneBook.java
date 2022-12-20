package homework5;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    public static void main(String[] args) {
        Map<String, String> bookFone = new HashMap<>();
        bookFone.put("Достоевский", "2-23-23");
        bookFone.put("Толстой", "3-23-63");
        bookFone.put("Пушкин", "2-76-53");
        bookFone.put("Лермонтов", "3 -15-78");
        bookFone.put("Грибоедов", "2-23-89, 2-43-53");
        bookFone.put("Фет", "2-15-13");
        bookFone.put("Симонов", "3-78-99, 2-29-00");
        System.out.println(bookFone.get("Достоевский"));
        System.out.println(bookFone.get("Байрон"));

        addPhoneBook(bookFone, "Булгаков", "2-02-45");

        System.out.println(bookFone.get("Булгаков"));

        deletePhoneBook(bookFone, "Фет");

        System.out.println(bookFone);
    }

    // Добавить или изменить или изменить данные
    public static void addPhoneBook(Map<String, String> dict, String name, String number){
        dict.put(name, number);
    }
    // Удалить данные
    public static void deletePhoneBook(Map<String, String> dict, String name){
        dict.remove(name);
    }
}
