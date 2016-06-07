package main;

import cats.Cat;
import dogs.Dog;

public abstract class Animal {

    private int weight;
    private String name;

    public Animal(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public void eat(Food food) {

        weight += food.getDozeWeight();
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Animal cat = new Cat("Barsik", 12);
        Animal dog = new Dog("Sharik", 30);
        cat.eat(new Food(3));
        dog.eat(new Food(7));
    }
}

