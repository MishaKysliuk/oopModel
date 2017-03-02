package main.java.org.oopmodel.entities;

import main.java.org.oopmodel.entities.interfaces.Animal;

/**
 * Created by MichaelMAC on 01.03.17.
 */
public abstract class Carnivore implements Animal<Herbivore> {

    @Override
    public abstract void eat(Herbivore food);
}
