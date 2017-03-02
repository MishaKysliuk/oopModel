package main.java.org.oopmodel.entities;

import main.java.org.oopmodel.entities.interfaces.Animal;
import main.java.org.oopmodel.entities.interfaces.Food;

/**
 * Created by MichaelMAC on 01.03.17.
 */
public abstract class Herbivore implements Animal<Plants>, Food {

    @Override
    public abstract void eat(Plants food);

}
