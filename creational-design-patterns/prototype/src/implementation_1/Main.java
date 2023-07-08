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

     }
}