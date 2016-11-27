package Animal;

import java.util.Objects;

public class Animal {
    public int age;

    public Animal(int age){
        this.age = age;
        System.out.println("An animal has been created!");
    }

    public void  sleep (){
        System.out.println("An animal is sleeping");
    }

    public void eat(){
        System.out.println("An animal is eating");
    }
    public static void main(String[] args) {
        Animal a = new Animal(3);
        Dog d = new Dog();
        Cat c = new Cat();
        d.ruff();
        c.meow();
        d.sleep();

        // Casting
        Object dog = new Dog();
        Dog realDog = (Dog) dog;
        realDog.ruff();

        Object str = "est ";
        String realS = (String) str;
        realS.getBytes();

        // What happens when..
        Dog doggy = new Dog();
        if (doggy instanceof Animal){
            Animal animal = (Animal) doggy;
            animal.sleep();

        }
        doggy.sleep();
    }
}
