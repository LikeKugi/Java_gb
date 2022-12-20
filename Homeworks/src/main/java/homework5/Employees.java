package homework5;
import java.util.*;

public class Employees {
    public static void main(String[] args) {

        List<String> listOfEmployees = new ArrayList<>();

        addEmployeeNames(listOfEmployees, new String[] {
                "Алёна", "Алёна", "Алёна", "Алёна",
                "Иван", "Иван", "Иван", "Светлана",
                "Пётр", "Пётр", "Кристина", "Анна",
                "Антон", "Анна", "Павел", "Мария",
                "Мария", "Мария","Марина","Марина"
        });

        System.out.println(howManyNames(listOfEmployees));
    }
    static TreeMap<String, Integer> howManyNames(List<String> names) {
        HashMap<String, Integer> result = new HashMap<>();
        for (String name : names) {
            if (result.containsKey(name)) {
                result.replace(name, result.get(name) + 1);
            } else {
                result.put(name, 1);
            }
        }
        TreeMap<String, Integer> sorted = new TreeMap<>(result);
        return sorted;
    }

    static void addEmployeeNames(List<String> listOfEmployees, String[] newEmployeeNames) {
        Collections.addAll(listOfEmployees, newEmployeeNames);
    }
}
