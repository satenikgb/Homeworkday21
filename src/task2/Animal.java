package task2;

public class Animal {
    protected int age;
    protected String name;
    public Animal(){};

    public Animal(int age,
                  String name){
        this.age=age;
        this.name=name;
    }
    protected void sound(){
        System.out.println("The animal sound is");
    }
}
