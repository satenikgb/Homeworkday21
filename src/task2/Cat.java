package task2;

public class Cat extends Animal{
    public Cat(){};
    @Override
    protected void sound() {
        System.out.println("The cat sound is mau mau");
    }
    public Cat(int age,String name){
        super.age=age;
        super.name=name;

    }
}
