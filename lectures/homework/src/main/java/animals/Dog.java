package animals;

public class Dog extends animals{
    private  String name;

    public int getMood() {
        return mood;
    }

    public void setMood(int mood) {
        if (mood > -1 && mood < 10) {
            this.mood = mood;
        } else {
            this.mood = 0;
        }
    }

    private int mood;
    private  int age;

    public Dog(String name, int mood, int age) {
        this.name = name;
        this.mood = mood;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    void tellAboutYourself() {
        System.out.printf("Привет, меня зовут %s, моё настроение %d \n", this.name, this.mood);
    }

    @Override
    void SayHi() {
        System.out.println("Гаввв!");
    }

    void tellAboutYourself(int count) {
        System.out.printf("Привет, меня зовут %s, я тебя укушу %d раз \n", this.name, count);
    }


}
