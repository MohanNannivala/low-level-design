package implementation_1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Bird> birds = List.of(
                new Crow(),
                new Sparrow(),
                new Crow()
        );

        List<Bird> children = new ArrayList<>();

        for(Bird parents : birds){
            children.add(parents.clone());
        }

        System.out.println("---------------Bird_Registry---------------------");

        Sparrow sparrow = new Sparrow();
        Crow crow = new Crow();

        BirdRegistry birdRegistry = new BirdRegistry();

        birdRegistry.registerBird("Sparrow", sparrow);
        birdRegistry.registerBird("Crow", crow);

        List<String> getBirdOfType = List.of(
                "Sparrow",
                "Crow"
        );

        List<Bird> requestedBird = new ArrayList<>();

        for (String bird : getBirdOfType){
            requestedBird.add(birdRegistry.getBird(bird).clone());
        }

     }
}