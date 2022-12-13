package practice3;

import java.util.*;

public class ex1 {

    /**
     * Даны следующие строки, cравнить их с помощью == и метода equals() класса Object
     * String s1 = "hello";
     * String s2 = "hello";
     * String s3 = s1;
     * String s4 = "h" + "e" + "l" + "l" + "o";
     * String s5 = new String("hello");
     * String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});
     */
    private static void Compares() {
        String s1 = "hello";
        String s2 = "hello";
        String s3 = s1;
        String s4 = "h" + "e" + "l" + "l" + "o";
        String s5 = new String("hello");
        String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});

        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s5));
        System.out.println(s1 == s5);

    }

    /**
     * Заполнить список десятью случайными числами.
     * Отсортировать список методом sort() и вывести его на экран.
     */
    private static void RandomList() {
        List<Integer> array = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            Random random = new Random();
            int val = random.nextInt(30);
            array.add(val);
        }
        Collections.sort(array);
        System.out.println(array);
    }

    /**
     * Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
     * Вывести название каждой планеты и количество его повторений в списке.
     */
    private static void PlanetsList() {
        int n = 1;
        List<String> planets = new ArrayList<>();
        planets.add("Mercury");
        planets.add("Venus");
        planets.add("Earth");
        planets.add("Mars");
        planets.add("Jupiter");
        planets.add("Saturn");
        planets.add("Uranus");
        planets.add("Neptune");
        planets.add("Pluto");
        planets.add("Earth");
        planets.add("Mars");
        planets.add("Jupiter");
        planets.add("Earth");
        planets.add("Mars");
        planets.add("Jupiter");
        planets.add("Earth");
        planets.add("Mars");
        planets.add("Jupiter");

        List<String> used = new ArrayList<>();

        for (int i = 0; i < planets.size() - 1; i++) {
            if (!used.contains(planets.get(i))){
                int freq = Collections.frequency(planets, planets.get(i));
                System.out.printf("%s: %d\n",planets.get(i), freq);
            }

            used.add(planets.get(i));
        }

        Iterator<String> planetsIter = planets.iterator();
        String old = planetsIter.next();

        while (planetsIter.hasNext()) {
            String next = planetsIter.next();
            if (old.equals(next)) {
                planetsIter.remove();
            }
            old = next;
        }
    }

    /**/
    private static void instanceOfString() {
        List array = new ArrayList<String>();
        array.add("ads");
        array.add(1);
        array.add("mfek");
        array.add(1);
        array.add(23);

        for (int i = 0; i < array.size();) {
            if(array.get(i) instanceof Integer){
                array.remove(i);
            } else {
                i++;
            }
        }
        System.out.println(array);
    }
    public static void main(String[] args) {
        Compares();
        RandomList();
        PlanetsList();
        instanceOfString();
    }

}
