package main.java.org.oopmodel.entities;

/**
 * Created by MichaelMAC on 01.03.17.
 */
public class Goat extends Herbivore {

    @Override
    public void eat(Plants food) {
        System.out.println("Goat is eating a " + food.toString());
    }

    @Override
    public String toString() {
        return "Goat";
    }
}
