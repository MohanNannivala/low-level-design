package implementation_1;

public class Bird implements Cloneable<Bird>{
    private String name;
    private String colour;
    private int weight;

    public Bird(){}

    public Bird(Bird oldBird){
        this.colour = oldBird.colour;
        this.name = oldBird.name;
        this.weight = oldBird.weight;
    }
    public Bird clone(){
        return new Bird(this);
    }
}
