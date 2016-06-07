package cats;

import java.util.Scanner;
import main.Animal;
import main.Food;

public class Cat extends Animal implements ICat {

    public Cat(String catName, int catWeight) {
        super(catName, catWeight);
    }

    public void doMeow(){
        System.out.println("My name is " + getName() + ". Meow meow");
    }

    @Override
    public void eat(Food food)
    {
        super.eat(food);
        doMeow();
    }

}
