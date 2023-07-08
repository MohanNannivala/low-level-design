package implementation_1;

public class Crow extends Bird {

    private String makeSound;

    public Crow(){}

    private Crow(Crow oldCrow){
        super(oldCrow);
        this.makeSound = oldCrow.makeSound;
    }

    @Override
    public Crow clone() {
        return new Crow(this);
    }
}
