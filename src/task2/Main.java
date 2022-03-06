package task2;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Cat cat = new Cat();
        Animal cat1 = new Cat();
        cat.sound();
        cat1.sound();
        animal.sound();
        System.out.println(animal.age);
        System.out.println(animal.name);
        System.out.println(cat.age);
        System.out.println(cat1.age);
        System.out.println(cat.name);
        System.out.println(cat1.name);

    }
}
