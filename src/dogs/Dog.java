package dogs;

import main.Animal;
import main.Food;

import java.util.Scanner;

public class Dog extends Animal implements IDog{

    public Dog(String dogName, int dogWeight) {
        super(dogName, dogWeight);
    }

    public void doBark(){
        System.out.println("My name is " + getName() + ". Bark bark");
    }

    @Override
    public void eat(Food food)
    {
        super.eat(food);
        doBark();
    }
}
