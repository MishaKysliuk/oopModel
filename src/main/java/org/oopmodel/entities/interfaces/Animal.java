package main.java.org.oopmodel.entities.interfaces;

/**
 * Created by MichaelMAC on 01.03.17.
 */
public interface Animal<T extends Food> {

    void eat(T food);

}
