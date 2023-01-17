package animals;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        animals dog = new Dog("Шарик", 1, 4);
        animals cat = new Cat("Матроскин", "Лучшая", 6);

        HashSet<animals> pets = new HashSet<>();
        pets.add(dog);
        pets.add(cat);

        pets.forEach(x -> x.SayHi());
    }
}
