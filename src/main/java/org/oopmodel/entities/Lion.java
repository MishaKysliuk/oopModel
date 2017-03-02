package main.java.org.oopmodel.entities;

/**
 * Created by MichaelMAC on 01.03.17.
 */
public class Lion extends Carnivore {

    @Override
    public void eat(Herbivore food) {
        System.out.println("Lion is eating a " + food.toString());
    }

    @Override
    public String toString() {
        return "Lion";
    }
}
