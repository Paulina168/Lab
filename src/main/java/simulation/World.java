package simulation;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class World {

    public static final Random random = new Random();
    private static final Animal animal = new Animal(new Vector2D(random.nextInt(100), random.nextInt(100)));

    public static void main(String[] args) {
        System.out.println("Start");
        run();
        System.out.println("Stop");
    }

    private static void run () {
       for(int i = 0; i < 10; i++) {
           animal.move(MapDirection.values()[random.nextInt(MapDirection.values().length)]);
       }
    }



}
