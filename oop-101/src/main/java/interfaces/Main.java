package interfaces;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Herbivore> herbivores = List.of(
                new Dog()
                ,new Human()
        );

        for (Herbivore herbivore: herbivores) {
            herbivore.eatPlant();
        }
    }
}
