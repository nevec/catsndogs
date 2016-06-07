package main;


import java.util.Scanner;

public class Food implements IFood {

    private int foodWeight;

    public Food(int foodWeight) {
        this.foodWeight = foodWeight;
    }

    public int getDozeWeight(){
        return foodWeight;
    }

}
