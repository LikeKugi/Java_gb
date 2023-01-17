package animals;

public class Cat extends animals{
    private String name;

    private String breed;

    private int age;

    public Cat(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    void tellAboutYourself() {
        System.out.printf("Привет, меня зовут %s, мой возраст %d, моё порода %s\n", this.name, this.age, this.breed);
    }

    @Override
    void SayHi() {
        System.out.println("Meow");
    }
}
