package implementation_1;

public class Sparrow extends Bird{

    private String makeSound;

    public Sparrow(){}

    public Sparrow(Sparrow oldSparrow){
        super(oldSparrow);
        this.makeSound = oldSparrow.makeSound;
    }

    @Override
    public Sparrow clone() {
        return new Sparrow(this);
    }
}
