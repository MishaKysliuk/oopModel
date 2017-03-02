We design a food chain OOP model. So, there are animals and food that they eat. 
We have got the carnivorous and herbivorous animals.
That is an issue. One animal can be the food for the other, but they are still animals. This example is possible: <br/>
    `Animal lion = new Lion();`<br/>
    `Food goat = new Goat();`<br/>
    `lion.eat(goat);` <br/> but at compile time we might not know anything about actual type of our animal and next example is 
    also possible: <br/>
    `Animal goat = new Goat();` <br/>
        `Food goatFood = new Goat();` <br/>
        `goat.eat(goatFood);` <br/>
     And it will be compiled, but at runtime we will get ClassCastException. To avoid this we could use animal generic 
     interface and the child classes which will implements the animal interface with appropriate behaviour. So, the next 
     example would not be compiled: <br/>
     `Animal<Plants> goat = new Goat();`<br/>
     `Food goatFood = new Goat();`<br/>
     `goat.eat(goatFood);` <br/>
     But we still could use animal interface without generic type and get the runtime ClassCastException. 
     To solve this problem at compile time, we need to split up our model if it is possible (use Herbivore and
     Carnivore abstractions instead of Animal) or to catch ClassCastException.
    