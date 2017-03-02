package main.java.org.oopmodel;

import main.java.org.oopmodel.entities.*;
import main.java.org.oopmodel.entities.interfaces.Animal;
import main.java.org.oopmodel.entities.interfaces.Food;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by MichaelMAC on 02.03.17.
 */
public class Main {

    public static void main(String[] args) {

        //It is possible that this animals can cause ClassCastException
        List<Animal> animals = new ArrayList<>();
        animals.add(new Lion());
        animals.add(new Goat());
        animals.add(new Cow());

        List<Animal<Plants>> animalThatEatPlants = new ArrayList<>();
        animalThatEatPlants.add(new Goat());
        animalThatEatPlants.add(new Cow());

        //That would not be compiled
        animalThatEatPlants.add(new Lion());


        List<Food> food = new ArrayList<>();
        food.add(new Grass());
        food.add(new Cow());
        food.add(new Goat());

        List<Plants> plants = new ArrayList<>();
        plants.add(new Grass());



        // Example that might cause the ClassCastException
        for(Animal animal: animals){
            for(Food foodUnit : food){
                try {
                    //Here we have unchecked call to the eat method
                    animal.eat(foodUnit);
                }catch (ClassCastException ex){
                    System.out.println(animal.toString() + " does not eat " + foodUnit.toString());
                }
            }
        }
        System.out.println();
        //Example that would not be compiled
        for(Animal<Plants> animal : animalThatEatPlants){
            for(Food foodUnit : food){
                //It would not be compiled, cause eat method is waiting for Plants type
                //and we do not need to make catch block
                 animal.eat(foodUnit);
            }
            //The right solution
            for(Plants plant : plants)
                animal.eat(plant);
        }



    }

}
