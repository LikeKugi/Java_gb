package FinalDog;

final class Dog{
    private final String name;
    private final int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public final void sayHi() {
        System.out.printf("WOW Dog %s %d y.o.", this.name, this.age);
    }

}
